package avancado.ReleasesJava11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class ClientHttp {

    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("Nova Thread criada :: "+ (thread.isDaemon() ? "deamon" : "")+ "Thread Group :: "+ thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws Exception {
//        connectAndPrintURLJavaOracle();
//        cconectAkamaiHttp11Cliente(); //// Tempo de carregamento total :: 3658 ms
        cconectAkamaiHttp2Cliente();  //// Tempo de carregamento total :: 7089 ms
    }


    private static void connectAndPrintURLJavaOracle() {
        try {
            var url = new URL("Https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();
            try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // Médoto HTTP 1.1
    private static void cconectAkamaiHttp11Cliente() throws Exception {
        System.out.println("Running HTTP/1.1 example ...");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1) // altera a versao do HttpClient
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code ::: "+response.statusCode());
            System.out.println("Response Headers ::: "+response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();
            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height="))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com"+image))
                                    .build();
                            try {
                                HttpResponse<String> imageResponse = httpClient.send(imgRequest, HttpResponse
                                        .BodyHandlers.ofString());
                                System.out.println("Imagem carregada :: "+image+", status code :: "+imageResponse
                                        .statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.println("Mensagem de erro durante requisição para recuperar a imagem :: "+image);
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Submetido um futuro para imagem :: "+image);
                    });
            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Error ao carregar imagem do futuro");
                }
            });

            long end = System.currentTimeMillis();
        }finally {
            executor.shutdown();
        }
    }

    // Médoto HTTP 2
    private static void cconectAkamaiHttp2Cliente() throws Exception {
        System.out.println("Running HTTP/2 example ...");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code ::: "+response.statusCode());
            System.out.println("Response Headers ::: "+response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();
            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height="))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com"+image))
                                    .build();
                            try {
                                HttpResponse<String> imageResponse = httpClient.send(imgRequest, HttpResponse
                                        .BodyHandlers.ofString());
                                System.out.println("Imagem carregada :: "+image+", status code :: "+imageResponse
                                        .statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.println("Mensagem de erro durante requisição para recuperar a imagem :: "+image);
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Submetido um futuro para imagem :: "+image);
                    });
           future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Error ao carregar imagem do futuro");
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total :: "+ (end - start) + " ms");
      }finally {
            executor.shutdown();
        }
    }

}


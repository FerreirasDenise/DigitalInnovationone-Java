package avancado.InterfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Joao", "Maria", "Jose", "Ana"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirDobroDeCadaItem(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de Projeto");
        profissoes.add("Gerente de Qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);

    }
    public static void imprimirNomesFiltrados(String... nomes) {

        String nomesParaImprimirFor = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Joao")) {
                nomesParaImprimirFor+=" "+nomes[i];
            }
        }
        System.out.println(nomesParaImprimirFor);

        String nomesParaImprimirStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining()); //String

        System.out.println(nomesParaImprimirStream);
    }

    public static void imprimirTodosNomes(String... nomes) {
        for (String nome:
             nomes) {
            System.out.println(nome);
        }
        Stream.of(nomes)
                .forEach(System.out::println);
            //    .forEach(nome -> System.out.println("Imprimindo pelo ForEach: "+nome);
    }

    public static void imprimirDobroDeCadaItem(Integer... numeros) {
        for (Integer numero:
             numeros) {
            System.out.println(numero*2);
        }
        Stream.of(numeros).map(numero -> numero*2)
                .forEach(System.out::println);
    }
}

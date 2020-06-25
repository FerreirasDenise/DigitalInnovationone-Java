package avancado.InterfacesFuncionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converteStringParaInteiroECalculaDobro = string -> Integer.valueOf(string) * 2;

        System.out.println(retornaNomeAoContrario.apply("Joao"));
        System.out.println(converteStringParaInteiroECalculaDobro.apply("20"));
    }
}

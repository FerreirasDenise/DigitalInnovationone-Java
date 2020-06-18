package avancado.InterfacesFuncionais;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {

        //Method reference
        Consumer<String> imprimirUmaFrase = System.out::println;

        //utiliza o parametro da forma que foi recebido
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);

        imprimirUmaFrase.accept("Hello World");
        //accept executa o comportamento do metodo
    }
}

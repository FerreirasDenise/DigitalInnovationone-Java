package avancado.ParadigmaFuncional;

import java.util.function.UnaryOperator;

public class ProgramaFuncional {

    public static void main(String[] args) {
        UnaryOperator<Integer> calculaValorVezesTres = valor -> valor*3; //Conceito programação funcionalAu
        int valor = 10;
        System.out.println("O resultado é: " + calculaValorVezesTres);
    }
}

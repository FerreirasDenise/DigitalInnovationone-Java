package modulo.core;

import modulo.utils.Operacao.Calculadora;

public class Runner {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(2, 5));
    }
}

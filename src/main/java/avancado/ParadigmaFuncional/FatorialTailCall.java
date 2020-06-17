package avancado.ParadigmaFuncional;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));

    }

    public static double fatorialA(double valor) {
        return fatorialComTailCall(valor, 1);
    }

    public static double fatorialComTailCall(double valor, double numero) {
        if (valor == 0) {
            return numero;
        }
        return fatorialComTailCall(valor - 1, numero * valor);
    }
}

//Explicação
/*
valor    numero
(5   *     1) entrada
(4   *   (1*5))
(3   *   (5*4))
(2   *   (20*3)
(1   *   (60*2))
(0         120)

 */

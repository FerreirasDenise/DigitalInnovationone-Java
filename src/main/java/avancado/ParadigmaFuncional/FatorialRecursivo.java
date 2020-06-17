package avancado.ParadigmaFuncional;

public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int value) {
        if (value == 1) {
            return value;
        } else {
            return value * fatorial(value - 1);
        }
    }

    //Explicação Recursividade
    /*
    (fatorial(5))
    (5 * (fatorial(4))
    (5 * (4 * (fatorial(3)))
    (5 * (4 * (3 * (fatorial(2))))
    (5 * (4 * (3 * (2 * (fatorial(1)))))
    (5 * (4 * (3 * (2 * 1)))
    (5 * (4 * (3 * 2)
    (5 * (4 * 6)
    (5 * 24)
    120
     */

}

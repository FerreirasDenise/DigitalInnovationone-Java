package avancado.ParadigmaFuncional;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificarSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        //Invocada mais de uma vez retornando o mesmo resultado
        System.out.println(verificarSeEMaior.test(13, 12));
        System.out.println(verificarSeEMaior.test(13, 12));
    }
}

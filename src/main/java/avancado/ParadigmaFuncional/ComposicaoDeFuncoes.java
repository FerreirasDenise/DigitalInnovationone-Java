package avancado.ParadigmaFuncional;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4};

        //Paradigma funcional
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));

        //Paradigma imperativo
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0){
                System.out.println(valores[i]*2);
            }
        }
    }
}

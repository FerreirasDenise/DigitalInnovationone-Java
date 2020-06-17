package avancado.ParadigmaFuncional;

public class Regras {
    public static void main(String[] args) {
        //Com uma instrucao retorno void
        Funcao1 funcao1 = valor -> System.out.println(valor);
        funcao1.gerar("Meu nome");

        //Mais de uma instrução retorno void
        Funcao1 funcao2 = valor -> {
            System.out.println(valor + "1");
            System.out.println(valor + "2");
        };
        funcao2.gerar("Outro nome");

        //Com uma instrucao retorno String
        Funcao2 funcao3 = valor -> valor;
        System.out.println(funcao3.retornar("Novo nome"));

        //Mais de uma instrução retorno String
        Funcao2 funcao4 = valor -> {
            String novoValor = "olá " + valor;
            String valorFinal = novoValor + "!";
            return valorFinal;
        };
        System.out.println(funcao4.retornar("Mundo"));

    }
}

interface Funcao1 {
    void gerar(String valor); //não retorna nada
}

interface Funcao2 {
    String retornar(String valor); //retorna String
}

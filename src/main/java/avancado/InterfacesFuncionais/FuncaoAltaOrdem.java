package avancado.InterfacesFuncionais;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo soma = (a, b) -> a+b;
        Calculo subtracao = (a, b) -> a-b;
        Calculo multiplicacao = (a, b) -> a*b;
        Calculo divisao = (a, b) -> a/b;

        System.out.println(executarOperacao(soma, 3,5));
        System.out.println(executarOperacao(subtracao, 10,2));
        System.out.println(executarOperacao(multiplicacao, 8,1));
        System.out.println(executarOperacao(divisao, 24,3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a,b);
    }

    interface Calculo{
        public int calcular(int a, int b);
    }

    // por parametro recebe outra função (mais comum no java)
    // ou retorna uma função
}

package avancado.InterfacesFuncionais;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());

    }

    static class Pessoa{
        private String nome;
        private Integer idade;

        public Pessoa(){
            nome = "Joao";
            idade = 25;
        }

        @Override
        public String toString() {
            return String.format("nome : %s, idade : %d",nome,idade);
        }
    }

}

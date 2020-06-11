package aulas.exercicios.oo.EncHerPolim;

public class Funcionarios {
    private String nome;
    private Double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calculaImposto() {
        return salario;
    }
}

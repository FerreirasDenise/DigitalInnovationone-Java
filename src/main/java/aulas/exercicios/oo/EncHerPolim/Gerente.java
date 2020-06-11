package aulas.exercicios.oo.EncHerPolim;

public class Gerente extends Funcionarios {
    @Override
    public Double calculaImposto() {
        return super.calculaImposto() * 0.1;
    }
}

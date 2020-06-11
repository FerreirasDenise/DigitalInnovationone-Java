package aulas.exercicios.oo.EncHerPolim;

public class Atendente extends Funcionarios{
    @Override
    public Double calculaImposto() {
        return super.calculaImposto() * 0.01;
    }
}

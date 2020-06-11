package aulas.exercicios.oo.EncHerPolim;

public class Supervisor extends Funcionarios{
    @Override
    public Double calculaImposto() {
        return super.calculaImposto() * 0.05;
    }
}

package aulas.exercicios.oo.EncHerPolim;

public class Programa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(1000.0);
        System.out.println("Imposto Gerente: " + gerente.calculaImposto());

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(1000.0);
        System.out.println("Imposto Supervisor: " + supervisor.calculaImposto());

        Atendente atendente = new Atendente();
        atendente.setSalario(1000.0);
        System.out.println("Imposto Atendente: " + atendente.calculaImposto());




    }
}

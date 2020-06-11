package aulas.exercicios.oo.construtores;

public class Programa {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 2010);

        carro.setQuantidade(3);
        System.out.println("Informaçõe do carro: ");
        System.out.println("Marca: " + carro.getMarca() + ". Modelo: " + carro.getModelo() + ". Ano: " + carro.getAno() + ".");
        System.out.println("Dentro do carro há " + carro.getQuantidade() + " pessoas.");

    }
}

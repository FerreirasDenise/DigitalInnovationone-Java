package collections.lists;

import java.util.List;
import java.util.Vector;

public class ProgramaVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tenis de Mesa");
        esportes.add("Handebol");

        //Altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");

        //Remove o esporte da posição 2
        esportes.remove(2);

        //Remove o esporte Handebol do vetor
        esportes.remove("Handebol");

        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navega nos esportes
        for (String esporte: esportes) {
            System.out.println(esporte);
        }
    }
}

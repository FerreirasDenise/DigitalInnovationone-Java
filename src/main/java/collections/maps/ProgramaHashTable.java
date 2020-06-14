package collections.maps;

import java.util.Hashtable;
import java.util.Map;

public class ProgramaHashTable {

    public static void main(String[] args ) {
        //Um pouco mais antigo, mais usado em cenarios de sincronização de threads
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        //Remove um estudante no indice 0
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        //Recupera um estudante no indice 2
        int idadeEstudante = estudantes.get("Mariana");

        System.out.println(idadeEstudante);

        System.out.println(estudantes.size());

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> estudante: estudantes.entrySet()) {
            System.out.println(estudante.getKey() + " - " + estudante.getValue());
        }

        for (String key: estudantes.keySet()) {
            System.out.println(key + " -- " + estudantes.get(key));
        }


    }
}

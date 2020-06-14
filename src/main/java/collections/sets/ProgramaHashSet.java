package collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProgramaHashSet {

    public static void main(String[] args) {
        //HashSet é o mais utilizado, não mantem a ordem dos itens inseridos
        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        //Remove a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        //Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        //Navega em todos os itens do iterator
        Iterator<Double> iteratorNotasAlunos = notasAlunos.iterator();

        while (iteratorNotasAlunos.hasNext()) {
            System.out.println("-->" + iteratorNotasAlunos.next());
        }

        for (Double nota: notasAlunos) {
            System.out.println("--->" + nota);
        }

        //Limpa o set
        //notasAlunos.clear();

        //Retorna se o está vazio ou nulo
        System.out.println(notasAlunos.isEmpty());

        notasAlunos.add(null);

        System.out.println(notasAlunos);
    }
}

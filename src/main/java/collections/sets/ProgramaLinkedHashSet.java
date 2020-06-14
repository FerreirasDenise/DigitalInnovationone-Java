package collections.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ProgramaLinkedHashSet {

    public static void main(String[] args) {

        //LinkedHashSet mantem a ordem natural que os elementos foram inseridos
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adiciona os numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //Remove o numero do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //Retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        //Navega em todos os itens do iterator
        Iterator<Integer> iteratorNumero = sequenciaNumerica.iterator();

        while (iteratorNumero.hasNext()) {
            System.out.println(iteratorNumero.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println(numero);
        }

        //Retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());
    }
}

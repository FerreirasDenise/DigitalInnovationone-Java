package collections.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class ProgramaTreeSet {

    public static void main(String[] args) {

        //Ordenacao de arv binarias - toda vez que modifica a estrutura o algoritmo de ordenação de tree é aplicado novamente
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a ultima capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianopolis"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a ultima capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais
        System.out.println(treeCapitais);

        //Navega em todos os itens do iterator

        Iterator<String> iteratorCapitais = treeCapitais.iterator();

        while (iteratorCapitais.hasNext()) {
            System.out.println("->" + iteratorCapitais.next());
        }

        for (String capital: treeCapitais) {
            System.out.println("---->" + capital);
        }

    }
}

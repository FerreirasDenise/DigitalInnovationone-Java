package collections.lists;

import java.util.*;

public class ProgramaList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2,"Denise"); // atualiza o index 2
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove(4); //remove o index 4
        System.out.println(nomes);

        String nome = nomes.get(1); //pega o valor do index 1
        System.out.println(nome);



        int posicao = nomes.indexOf("Carlos"); //retorna index do elemento (caso não exista, retorna -1)
        System.out.println(posicao);

        int tamanho = nomes.size(); //retorna tamanho da lista
        System.out.println(tamanho);

        boolean temDenise = nomes.contains("Denise"); //booleano verifica se tem Denise na lista
        System.out.println(temDenise);

        boolean listaVazia = nomes.isEmpty(); //booleano verifica se a lista está vazia
        System.out.println(listaVazia);

        /*nomes.clear(); //limpa a lista
        System.out.println(nomes);*/

        for (String nomeItem: nomes) {
            System.out.println(nomeItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}

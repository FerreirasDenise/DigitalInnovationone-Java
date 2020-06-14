package collections.queues;

import java.util.*;

public class ProgramaLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); //retorna e remove primeiro elemento da fila
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); //retorna mas não remove o primeiro elemento da fila (fila vazia retorna null)
        System.out.println(primeiroCliente);

        //filaBanco.clear();
        String primeiroClienteErro = filaBanco.element(); //retorna mas não remove o primeiro elemento da fila (fila vazia retorna exception)
        System.out.println(primeiroClienteErro);

        for (String client: filaBanco) {
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("->" + iteratorFilaBanco.next());
        }
    }
}

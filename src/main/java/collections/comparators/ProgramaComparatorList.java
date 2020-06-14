package collections.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProgramaComparatorList {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("---- Ordem de inserção ----");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("---- Ordem natural dos numeros - idade ----");
        System.out.println(estudantes);

        //Sintaxe Lambda
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("---- Ordem reversa dos numeros - idade ----");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("---- Ordem natural dos numeros - idade (method reference) ----");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("---- Ordem reversa dos numeros - idade (method reference) ----");
        System.out.println(estudantes);

        //só pode passar como argumento uma lista de um objeto que implementa Comparable
        Collections.sort(estudantes);
        System.out.println("---- Ordem natural dos numeros - idade (interface Comparable) ----");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("---- Ordem reversa dos numeros - idade (interface Comparator) ----");
        System.out.println(estudantes);


    }
}

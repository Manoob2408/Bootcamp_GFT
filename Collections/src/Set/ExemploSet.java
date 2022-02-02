package Set;// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5: ");
        //Não há como pois o Set não possuí índice

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        //Não há como pois o Set não possuí índice

        System.out.println("Substitua a nota 5.0 pela nota 4.0: ");
        //Não há como pois não é uma list

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a 3a nota adicionada: ");
        //Não há como

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + soma/notas.size());

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova anota da posição 0: ");
        //Não há como

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        // notas.removeIf(next -> next < 7);
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas1 = new LinkedHashSet<>(); //Apenas com o LinkedHashSet é possível exibir as notas na ordem que foram informadas
        notas1.add(7d);
        notas1.add(8.5);
        notas1.add(9.3);
        notas1.add(5d);
        notas1.add(7d);
        notas1.add(0d);
        notas1.add(3.6);
        System.out.println(notas1);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas1); //Apenas com o LinkedHashSet é possível exibir as notas na ordem natural
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas3.isEmpty());
    }
}

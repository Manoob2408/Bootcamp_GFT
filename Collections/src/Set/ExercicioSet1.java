package Set;

import java.util.*;

/*
Crie um conjunto contendo as cores do arco-íris e:
A. Exiba todas as cores uma abaixo da outra
B. A quantidade de cores que o arco-íris tem
C. Exiba as cores em ordem alfabética
D. Exiba as cores na ordem inversa da que foi informada
E. Exiba todas as cores que começam com a letra ”v”
F. Remova todas as cores que não começam com a letra “v”
G. Limpe o conjunto
H. Confira se o conjunto está vazio

 */
public class ExercicioSet1 {

    public static void main(String[] args) {

        System.out.println("\nA. Exiba todas as cores uma abaixo da outra");
        Set<String> cores = new HashSet<>(Arrays.asList("Vermelho","Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("\nB. A quantidade de cores que o arco-íris tem");
        System.out.println(cores.size());

        System.out.println("\nC. Exiba as cores em ordem alfabética");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("\nD. Exiba as cores na ordem inversa da que foi informada");
        Set<String> cores3 = new LinkedHashSet<>(cores);
        List<String> cores3List = new ArrayList<>(cores3);
        Collections.reverse(cores3List);
        System.out.println(cores3);
        System.out.println(cores3List);

        System.out.println("\nE. Exiba todas as cores que começam com a letra ”v”");
        for(String cor : cores){
            if(cor.startsWith("V"))
                System.out.println(cor);
        }

        System.out.println("\nG. Limpe o conjunto");
        cores.clear();

        System.out.println("\nH. Confira se o conjunto está vazio: " + cores.isEmpty());


    }

}

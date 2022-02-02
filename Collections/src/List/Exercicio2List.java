package List;

import java.util.*;

/**
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
 * "Telefonou para a vítima?"
 * "Esteve no local do crime?"
 * "Mora perto da vítima?"
 * "Devia para a vítima?"
 * "Já trabalhou com a vítima?"
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
 * entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente".
 */
public class Exercicio2List {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima? S/N");
        String str = scanner.next();
        respostas.add(str.toLowerCase());

        System.out.println("Esteve no local do crime? S/N");
        str = scanner.next();
        respostas.add(str.toLowerCase());

        System.out.println("Mora perto da vítima? S/N");
        str = scanner.next();
        respostas.add(str.toLowerCase());

        System.out.println("Devia para a vítima? S/N");
        str = scanner.next();
        respostas.add(str.toLowerCase());

        System.out.println("Já trabalhou com a vítima? S/N");
        str = scanner.next();
        respostas.add(str.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> iterator = respostas.iterator();
        while (iterator.hasNext()){
            String resp = iterator.next();
            if(resp.contains("s")){
                count++;
            }
        }

        switch(count){
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
                break;
        }



    }


}

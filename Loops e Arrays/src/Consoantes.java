/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String letra;
        String[] consoantes = new String[6];
        int i = 0;
        int qtd = 0;


        while(i<6){
            System.out.println("Letra: ");
            letra = scan.next();

            if(!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))){
                qtd++;
                consoantes[i] = letra;
            }

            i++;
        }

        System.out.println("Quantidade de consoantes: " + qtd);

        for(String consoante : consoantes){
            if(consoante != null){
                System.out.println(consoante);
            }
        }


    }


}

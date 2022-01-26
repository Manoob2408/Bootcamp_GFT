/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Aleatorios {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] num = new int[20];

        for(int i = 0; i < num.length; i++ ){
            num[i] = rand.nextInt(100);
        }

        System.out.println("Números Aleatórios: ");
        for(int numero : num){
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : num) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : num) {
            System.out.print((numero+1) + " ");
        }

    }
}

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de números: ");
        int qtd = scan.nextInt();

        int i = 0;
        double num = 0;
        int par = 0;
        int impar = 0;

        do{
            System.out.println("Numero " + i + ": ");
            num = scan.nextDouble();

            if(num%2 == 0){
                par++;
            }else{
                impar++;
            }
            i++;
        }while(i<qtd);

        System.out.println("Pares: " + par);
        System.out.println("Ímpares: " + impar);

    }
}

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Numero: ");
        int num = scan.nextInt();
        int i = num;
        int fatorial = 1;

        while(i>0){
            fatorial *= i;
            i--;
        }

        System.out.println(num + "! = " + fatorial);
    }
}

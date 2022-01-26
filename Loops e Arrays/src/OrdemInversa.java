/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

import java.util.Scanner;

public class OrdemInversa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] num = new int[6];
        int i = 0;

        while(i<6){
            System.out.println("Numero " + i + ": ");
            num[i] = scan.nextInt();
            i++;
        }

        for(i=5; i>=0; i--){
            System.out.print(num[i] + " ");
        }
    }
}

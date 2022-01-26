/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 0;
        double media = 0;
        double maior = 0;
        double[] num = new double [5];

        while(i<5){
            System.out.println("Numero " + i + ": ");
            num[i] = scan.nextDouble();
            i++;
        }

        for(i=0; i<5; i++){

            if(num[i] > maior || i == 0){
                maior = num[i];
            }

            media += num[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media/5);
    }
}

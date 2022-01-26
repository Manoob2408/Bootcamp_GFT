/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class NomeEIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome = null;
        int idade = 0;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next(); //Prevents from filling in the buffer

            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Acabou!");

    }
}

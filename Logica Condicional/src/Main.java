import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       System.out.println("Operadores Relaciomais:");
       operadoresRelacionais();

       System.out.println("Operadores Lógicos:");
       operadoresLogicos();

       System.out.println("Controle de fluxo:");
       controleFluxo();

    }

    public static void operadoresRelacionais(){

       int i1 = 10;
       int i2 = 20;
       float f1 = 4.5f;
       float f2 = 3.5f;
       double d1 = 59.6d;
       char c1 = 'x';
       char c2 = 'y';
       String s1 = "Fulano";
       String s2 = "Fulano";
       String s3 = "Cicrano";
       boolean b1 = true;
       boolean b2 = false;

       long l1 = 1597L;
       long l2 = 8997L;
       byte y1 = 1;
       short h1 = 25;

       System.out.println("i1 == i2 " + (i1 == i2));
       System.out.println("i1 != i2 " + (i1 != i2));
       System.out.println("i1 > i2 " + (i1 > i2));
       System.out.println("i1 <= i2 " + (i1 <= i2));

       System.out.println("f1 == f2 " + (f1 == f2));
       System.out.println("f1 != f2 " + (f1 != f2));
       System.out.println("f1 >= f2 " + (f1 >= f2));
       System.out.println("f1 < f2 " + (f1 < f2));

       System.out.println("c1 == c2 " + (c1 == c2));
       System.out.println("c1 != c2 " + (c1 != c2));
       System.out.println("c1 > c2 " + (c1 > c2));
       System.out.println("c1 <= c2 " + (c1 <= c2));

       System.out.println("s1 == s2 " + (s1 == s2));
       System.out.println("s1 == s3 " + (s1 == s3));
       System.out.println("s1 != s2 " + (s1 != s2));
       //System.out.println(s1 >= s2);
       //System.out.println(s1 < s2);

       System.out.println("b1 == b2 " + (b1 == b2));
       System.out.println("b1 != b2 " + (b1 != b2));
       //System.out.println(b1 > b2);
       //System.out.println(b1 <= i1);

       System.out.println("i2 > f1 " + (i2 > f1));
       System.out.println("d1 == h1 " + (d1 == h1));
       //System.out.println(s2 != c1);
       //System.out.println(s3 != i1);

       System.out.println("l1 == i2 " + (l1 == i2));
       System.out.println("l2 >= i1 " + (l2 >= i1));
       System.out.println("y1 != h1 " + (y1 != h1));
    }

    public static void operadoresLogicos(){

       boolean b1 = true;
       boolean b2 = false;
       boolean b3 = true;
       boolean b4 = false;

       System.out.println("b1 && b2 " + (b1 && b2));
       System.out.println("b1 && b3 " + (b1 && b3));

       System.out.println("b2 || b3 " + (b2 || b3));
       System.out.println("b2 || b4 " + (b2 || b4));

       System.out.println("b1 ^ b3 " + (b1 ^ b3));
       System.out.println("b4 ^ b1 " + (b4 ^ b1));

       System.out.println(!b1);
       System.out.println(!b2);

       int i1 = 10;
       int i2 = 5;
       float f1 = 20f;
       float f2 = 50f;
       System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
       System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));
    }

    public static void controleFluxo(){

       Scanner scan = new Scanner(System.in);
       System.out.println("Mês: ");
       int mes = scan.nextInt();
       scan.nextLine();

       System.out.println("Dia da semana: ");
       String dia = scan.nextLine();

       System.out.println("Numero: ");
       int num = scan.nextInt();
       scan.nextLine();

       mesAno(mes);
       ferias(mes);
       diaSemana(dia);
       numero(num);
    }

   public static void mesAno(int i){
      if(i == 1){
         System.out.println("Janeiro");
      }else if(i == 2){
         System.out.println("Fevereiro");
      }else if(i == 3){
         System.out.println("Março");
      }else if(i == 4){
         System.out.println("Abril");
      }else if(i == 5){
         System.out.println("Maio");
      }else if(i == 6){
         System.out.println("Junho");
      }else if(i == 7){
         System.out.println("Julho");
      }else if(i == 8){
         System.out.println("Agosto");
      }else if(i == 9){
         System.out.println("Setembro");
      }else if(i == 10){
         System.out.println("Outubro");
      }else if(i == 11){
         System.out.println("Novembro");
      }else if(i == 12){
         System.out.println("Dezembro");
      }else {
         System.out.println("Mês inválido!");
      }
   }

   public static void ferias(int mes){
      if(mes == 7 || mes == 12 || mes == 1){
         System.out.println("Férias!");
      }else{
         System.out.println("Não é férias :(");
      }
   }

   public static void diaSemana(String dia){
      switch(dia){
         case "Domingo":
            System.out.println(1);
            break;
         case "Segunda":
            System.out.println(2);
            break;
         case "Terça":
            System.out.println(3);
            break;
         case "Quarta":
            System.out.println(4);
            break;
         case "Quinta":
            System.out.println(5);
            break;
         case "Sexta":
            System.out.println(6);
            break;
         case "Sábado":
            System.out.println(7);
            break;
         default:
            System.out.println("Dia inválido");
            break;
      }
   }

   public static void numero(int num){
      switch(num){
         case 1:
         case 2:
         case 3:
            System.out.println("Certo");
            break;
         case 4:
            System.out.println("Errado");
            break;
         case 5:
            System.out.println("Talvez");
            break;
         default:
            System.out.println("Valor indefinido!");
            break;
      }
   }
}

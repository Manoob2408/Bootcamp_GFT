package exer3;

public class Main3 {

    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for(ClasseMae classe : classes){
            classe.metodo1(); //Polimorfismo
        }

        System.out.println(" ");

        for(ClasseMae classe : classes){
            classe.metodo2(); //Polimorfismo
        }

        System.out.println(" ");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo1(); //Sobrescrita
    }
}

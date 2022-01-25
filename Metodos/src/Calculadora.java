public class Calculadora {

    public static void soma(double numero1, double numero2){
        double soma = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a: " + soma);
    };

    public static void subtracao(double numero1,double numero2){
        double subtracao = numero1 - numero2;
        System.out.println("A subtração de " + numero1 + " e " + numero2 + " é igual a: " + subtracao);
    };

    public static void multiplicacao(double numero1, double numero2){
        double multiplicacao = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é igual a: " + multiplicacao);
    };

    public static void divisao(double numero1, double numero2){
        double divisao = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + " e " + numero2 + " é igual a: " + divisao);
    };
}

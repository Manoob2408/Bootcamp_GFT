public class Area {
    /**
     * Calcula área de quadriláteros utilizando Sobrecarga
     *
     */

    public static void calculaArea(double lado){
        double area = lado * lado;
        System.out.println("A área do quadrado é igual a: " + area);
    }

    public static void calculaArea(double largura, double comprimento){
        double area = largura * comprimento;
        System.out.println("A área do retângulo é igual a: " + area);
    }

    public static void calculaArea(double baseMaior, double baseMenor, double altura){
        double area = ((baseMaior + baseMenor) * altura)/2;
        System.out.println("A área do trapézio é igual a: " + area);
    }
}

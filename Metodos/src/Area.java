public class Area {
    /**
     * Calcula área de quadriláteros utilizando Sobrecarga
     *
     */

    public static double calculaArea(double lado){

        return lado * lado;
    }

    public static double calculaArea(double largura, double comprimento){

        return largura * comprimento;
    }

    public static double calculaArea(double baseMaior, double baseMenor, double altura){

        return ((baseMaior + baseMenor) * altura)/2;

    }
}

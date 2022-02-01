import javax.swing.*;

//Fazer a divisão de dois valores
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;


        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Informe um número inteiro! \n" + e.getMessage());
                //e.printStackTrace();

            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossível dividir número por zero! \n");
                //e.printStackTrace();
            }
            finally {
                System.out.println("Chegou no finally...");
            }

        }while(continueLooping);

        System.out.println("Chegou até aqui...");
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}

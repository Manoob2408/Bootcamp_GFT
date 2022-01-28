package exer1;

//Classe exer1.Carro
public class Carro extends Veiculo {

    //Atributos
    private String cor;
    private String modelo;
    private int capacidadeTanque;

    //Construtor
    public Carro(){

    }

    //Sobrecarga
    public Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //Getters and Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    //Método do Total para Encher Tanque
    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }
}

package List;

import java.util.ArrayList;
import java.util.List;

/**
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
 * e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
 */
public class Exercicio1List {

    public static void main(String[] args) {

        Double soma = 0d;
        Double media = 0d;
        List<Temperatura> temperaturas = new ArrayList<>(){{
           add(new Temperatura("1 - Janeiro", 29.4));
           add(new Temperatura("2 - Fevereiro", 24.5));
           add(new Temperatura("3 - Março", 12.4));
           add(new Temperatura("4 - Abril", 16.6));
           add(new Temperatura("5 - Maio", 25.4));
           add(new Temperatura("6 - Junho", 26.8));
        }};
        for (Temperatura temperatura : temperaturas) {
            soma += temperatura.getTemp();
        }

        media = soma/temperaturas.size();
        System.out.println("Média: " + media);
        System.out.println("Temperaturas acima da média: ");
        for (Temperatura temperatura : temperaturas) {
            if(temperatura.getTemp() > media)
                System.out.println(temperatura);
        }


    }
}

class Temperatura{

    String mes;
    Double temp;

    public Temperatura(String mes, Double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "List.Temperatura{" +
                "Mês='" + mes + '\'' +
                ", List.Temperatura=" + temp +
                '}';
    }
}
package com.dio.base;

import java.math.BigDecimal;

/**
 * Representa um pedido
 * 
 * @author Emanuela Lopez
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 */
public class Order {

    private final String code;
    private final BigDecimal totalValue;
    private String[] items;

    /**
     * Construtor da classe
     * 
     * @param code       Código do pedido
     * @param totalValue Total do pedido
     */
    public Order(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "Order={" +
                "code='" + code + "'" +
                "}";
    }

    /**
     * Calcula as taxas de acordo com o valor total do pedido. Se o valor for maior
     * que 100, uma taxa será cobrada
     * 
     * @return Valor total do pedido com as taxas calculadas
     * @throws RuntimeException Se o pedido for um valor negativo
     */
    public BigDecimal calculateFee() throws RuntimeException {
        if (this.totalValue.signum() < 0) {
            throw new RuntimeException("O pedido não pode ter valor negativo!");
        }
        if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100) {
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }

    public void printItems() {
        // int i = 0;
        /*
         * while (i < items.length) {
         * System.out.println(items[i]);
         * i++;
         * };
         */

        /*
         * do{
         * System.out.println(items[i]);
         * i++;
         * }while(i < items.length);
         */

        /*
         * for(int i=0; i< items.length; i++)
         * {
         * System.out.println(items[i]);
         * }
         */

        for (String i : items) {
            System.out.println(i);
        }
    }

}

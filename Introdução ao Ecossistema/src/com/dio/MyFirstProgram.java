package com.dio;

import java.math.BigDecimal;

import com.dio.base.Order;

public class MyFirstProgram {
    public static void main(String[] args) {

        Order order = new Order("code1234", new BigDecimal("99.99"));

        System.out.println(order);
    }

}
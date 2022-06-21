package com.anahuac;

import com.anahuac.junit.calculadora.Calculadora;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculadora calculadora = new Calculadora();
        calculadora.suma(10, 5);
        System.out.println(calculadora.getUltimoResultado());
    }
}

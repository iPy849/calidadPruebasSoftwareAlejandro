package com.anahuac.junit4;

import com.anahuac.junit.calculadora.Calculadora;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalculadoraTestJunit4 {

    Calculadora calculadora;

    // Antes de todo_ el proceso de testing
    @BeforeClass
    public static void firstOfAll(){
        System.out.println("Heyyyy!!! Before all, IDK if you pass or not. xD");
    }

    // Antes de cada test
    @Before
    public void setup(){
        System.out.println("Lets get settle this down!!!");
        this.calculadora = new Calculadora();
    }

    @After
    public void tearDown(){
        System.out.println("Heyyy Tear down up!");
    }

    @Test
    public void sumaTest() {
        double resultadoEsperado = 4;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.suma(3, 1);
        assertThat(resultado, is(resultadoEsperado));
    }

    @Test
    public void restaTest() {
        double resultadoEsperado = 2;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.resta(3, 1);
        assertThat(resultado, is(resultadoEsperado));
    }

    @Test
    public void restaNegativaTest() {
        double resultadoEsperado = -4;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.resta(-3, 1);
        assertThat(resultado, is(resultadoEsperado));
    }

    @Test
    public void multiplicacionTest() {
        double resultadoEsperado = 6;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicacion(3, 2);
        assertThat(resultado, is(resultadoEsperado));
    }

    @Test
    public void divisionTest() {
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.division(3, 1);
        assertThat(resultado, is(resultadoEsperado));
    }

    @Test(expected = ArithmeticException.class)
    public void Division_Cero_Denominador(){
        double resultadoEsperado = 3;
        double resultado = calculadora.division(5, 0);
    }

}
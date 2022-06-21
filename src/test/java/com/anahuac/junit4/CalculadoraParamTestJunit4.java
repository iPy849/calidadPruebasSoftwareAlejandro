package com.anahuac.junit4;

import com.anahuac.junit.calculadora.Calculadora;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(Parameterized.class)
public class CalculadoraParamTestJunit4 {

    private double arg1, arg2, arg3;
    Calculadora calculadora;

    public CalculadoraParamTestJunit4(double arg1, double arg2, double arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    // Antes de cada test
    @Before
    public void setup() {
        this.calculadora = new Calculadora();
    }

    @After
    public void tearDown() {
    }

    @Parameters
    public static Collection<Object[]> inputSuma() {
        return Arrays.asList(new Object[][]{
                {1,2,3},
                {3,5,8},
                {5,7,12},
                {10, 0, Double.POSITIVE_INFINITY},
                {0,0, Double.NaN}
        });
    }


    @Test
    public void sumaTest() {
        double resultado = calculadora.suma(this.arg1, this.arg2);
        assertThat(resultado, is(this.arg3));
    }

}

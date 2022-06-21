/*
package com.anahuac.jupiter.calculadora;

import com.anahuac.junit.calculadora.Calculadora;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CalculadoraTest {

    Calculadora calculadora;

    // Antes de todo_ el proceso de testing
    @BeforeAll
    static void firstOfAll(){
        System.out.println("Heyyyy!!! Before all, IDK if you pass or not. xD");
    }

    // Antes de cada test
    @BeforeEach
    void setup(){
        System.out.println("Lets get settle this down!!!");
        this.calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown(){
        System.out.println("Heyyy Tear down up!");
    }

    @Test
    @Disabled
    @DisplayName("Probando la suma brou")
    void sumaTest() {
        double resultadoEsperado = 4;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.suma(3, 1);
        assertThat(resultado, is(resultadoEsperado));
    }

    @Test
    @Tag("Resta")
    @DisplayName("Probando la resta brou")
    void restaTest() {
        double resultadoEsperado = 2;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.resta(3, 1);
        assertThat(resultado, is(resultadoEsperado));
    }

    @Test
    @Tag("Resta")
    @DisplayName("Probando la resta con negativos brou")
    void restaNegativaTest() {
        double resultadoEsperado = -4;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.resta(-3, 1);
        assertThat(resultado, is(resultadoEsperado));
    }

    @Test
    @DisplayName("Probando la multiplicación brou")
    void multiplicacionTest() {
        double resultadoEsperado = 6;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicacion(3, 2);
        assertThat(resultado, is(resultadoEsperado));
    }

    @Test
    @DisplayName("Probando la división brou")
    void divisionTest() {
        double resultadoEsperado = 2;
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.division(3, 1);
        assertThat(resultado, is(resultadoEsperado));
    }
}*/

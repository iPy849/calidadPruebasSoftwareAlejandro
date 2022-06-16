package com.anahuac.calculadora;

import com.anahuac.calculadora.Calculadora;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CalculadoraParamTest {

    Calculadora calculadora;

    // Antes de todo_ el proceso de testing
    @BeforeAll
    static void firstOfAll() {
        System.out.println("Heyyyy!!! Before all, IDK if you pass or not. xD");
    }

    // Antes de cada test
    @BeforeEach
    void setup() {
        System.out.println("Lets get settle this down!!!");
        this.calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Heyyy Tear down up!");
    }

    private static Stream<Arguments> inputSuma() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, 1, 3),
                Arguments.of(3, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("inputSuma")
    @DisplayName("Probando la suma brou")
    void sumaTest(double n, double m, double r) {
        double resultado = calculadora.suma(n, m);
        assertThat(resultado, is(r));
    }

}
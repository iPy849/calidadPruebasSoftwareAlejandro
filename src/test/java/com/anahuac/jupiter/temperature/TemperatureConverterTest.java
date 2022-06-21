/*
package com.anahuac.jupiter.temperature;

import com.anahuac.junit.temperature.CelsiusData;
import com.anahuac.junit.temperature.FarenheitData;
import com.anahuac.junit.temperature.TemperatureConverter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class TemperatureConverterTest {
    private TemperatureConverter temperatureConverter;
    private double conversionError = .9;

    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    @AfterEach
    void tearDown() {
        temperatureConverter = null;
    }

    @Test
    @DisplayName("Fº => Cº")
    void toCelsius() {
        double expectedResult = -17.22;
        FarenheitData farenheitData = new FarenheitData();
        farenheitData.setValue(1);

        CelsiusData celsiusData = temperatureConverter.toCelsius(farenheitData);
        assertThat(celsiusData.getValue(), is(closeTo(expectedResult, conversionError)));
    }

    @Test
    @DisplayName("Cº => Fº")
    void toFarenheit() {
        double expectedResult = 33.8;
        CelsiusData celsiusData = new CelsiusData();
        celsiusData.setValue(1);

        FarenheitData farenheitData = temperatureConverter.toFarenheit(celsiusData);
        assertThat(farenheitData.getValue(), is(closeTo(expectedResult, conversionError)));
    }
}*/

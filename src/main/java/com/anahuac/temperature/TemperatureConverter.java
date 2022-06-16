package com.anahuac.temperature;

public class TemperatureConverter {

    public CelsiusData toCelsius(FarenheitData input){
        double value = (input.getValue() - 32) * 0.55;
        CelsiusData celsiusData = new CelsiusData();
        celsiusData.setValue(value);
        return celsiusData;
    }

    public FarenheitData toFarenheit(CelsiusData input){
        double value = (input.getValue() * 1.8) + 32;
        FarenheitData farenheitData = new FarenheitData();
        farenheitData.setValue(value);
        return farenheitData;
    }

}

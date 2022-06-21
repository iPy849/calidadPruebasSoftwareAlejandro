package com.anahuac.junit.calculadora;

public class Calculadora {

    private double ultimoResultado;

    public double getUltimoResultado() {
        return ultimoResultado;
    }

    public double suma(double n, double m){
        return ultimoResultado = n + m;
    }

    public double resta(double n, double m){
        return ultimoResultado = n - m;
    }

    public double multiplicacion(double n, double m){
        return ultimoResultado = n * m;
    }

    public double division(double n, double m){
        if(m == 0) throw new ArithmeticException("Dividing by 0 is not allow");
        return ultimoResultado = n / m;
    }
}

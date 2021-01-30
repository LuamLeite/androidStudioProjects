package com.example.calculadora;

public class Calc {
    double valor1, valor2, resultado;

    public Calc() {}
    public Calc(double v1, double v2) {
        setValor1(v1);
        setValor2(v2);
    }
    public void setValor1(double valor){
    valor1 = valor;
    }
    public void setValor2(double valor){
        valor2 = valor;
    }
    public double getValor1(){
        return valor1;
    }
    public double getValor2(){
        return valor2;
    }
    public double somar(){
        return valor1 + valor2;
    }
    public double subtrair(){ return valor1 - valor2; }
    public double multiplicar(){
        return valor1 * valor2;
    }
    public double dividir(){ return valor1 / valor2; }

}

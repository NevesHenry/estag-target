package org.example;

public class FaturamentoDiario {
    private int dia;
    private double valor;

    public FaturamentoDiario(int data, double valor) {
        this.dia = data;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public double getValor() {
        return valor;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{" +
                "dia='" + dia + '\'' +
                ", valor=" + valor +
                '}';
    }
}

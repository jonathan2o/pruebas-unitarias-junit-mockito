package com.example;

public class Cliente {

    private String nombre;
    private double saldo;

    public Cliente(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
//Nuestro primer Getter
    public String getNombre() {
        return nombre;
    }
//Nuestro segundo Getter
    public double getSaldo() {
        return saldo;
    }
//Nuestro primer Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//Nuestro segundo Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//Metodo para consultar el saldo
    public double consultarSaldo() {
    return saldo;}
//  Metodo para consignar dinero
    public void consignar(double valor) {
        saldo += valor; 
    }
//  Metodo para retirar dinero
    public void retirar(double valor) {

        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        saldo -= valor;
    }
}
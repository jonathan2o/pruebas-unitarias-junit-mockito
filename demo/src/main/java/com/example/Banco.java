package com.example;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public double consultarCajaTotal() {

        double total = 0;

        for (Cliente cliente : clientes) {
            total += cliente.consultarSaldo();
        }

        return total;
    }
}
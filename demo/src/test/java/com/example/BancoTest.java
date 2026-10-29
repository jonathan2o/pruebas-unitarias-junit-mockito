package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {
        @Test
    public void deberiaCalcularCajaTotal() {

        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Juan", 1000);
        Cliente cliente2 = new Cliente("Pedro", 2000);

        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        assertEquals(3000, banco.consultarCajaTotal());

    }

}
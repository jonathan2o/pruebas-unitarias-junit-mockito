package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClienteTest {

    @Test
    public void deberiaCrearClienteCorrectamente() {

        Cliente cliente = new Cliente("Juan", 1000);

        assertEquals("Juan", cliente.getNombre());

        assertEquals(1000, cliente.getSaldo());

    }
        @Test
    public void deberiaConsignarDineroCorrectamente() {

        Cliente cliente = new Cliente("Juan", 1000);

        cliente.consignar(500);

        assertEquals(1500, cliente.getSaldo());

    }
        @Test
    public void deberiaRetirarDineroCorrectamente() {

        Cliente cliente = new Cliente("Juan", 1000);

        cliente.retirar(300);

        assertEquals(700, cliente.getSaldo());

    }
    @Test
    public void noDeberiaPermitirRetirarMasDelSaldo() {

        Cliente cliente = new Cliente("Juan", 1000);

        assertThrows(
            IllegalArgumentException.class,
            () -> cliente.retirar(2000)
        );

    }
}
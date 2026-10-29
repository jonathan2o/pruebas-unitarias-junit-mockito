package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BancoMockitoTest {
        @Test
    public void deberiaCrearMockCliente() {

        Cliente cliente = mock(Cliente.class);

        assertNotNull(cliente);

    }
    @Test
    public void deberiaRetornarSaldoDelMock() {

        Cliente cliente = mock(Cliente.class);

        when(cliente.getSaldo()).thenReturn(5000.0);

        assertEquals(5000.0, cliente.getSaldo());

    }
    @Test
    public void deberiaVerificarConsignacion() {

        Cliente cliente = mock(Cliente.class);

        cliente.consignar(1000);

        verify(cliente).consignar(1000);

    }

}
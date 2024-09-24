package test;

import static org.junit.Assert.*;
import org.junit.Test;

import domain.Valor;

public class ValorTest {


    Valor valor = new Valor(100.0, 200.0, 300.0, 50.0, 25.0);

    @Test
    public void testGetTarifaBasica() {
        assertEquals("A tarifa básica deve ser 100.0", 100.0, valor.getTarifaBasica(), 0.001);
    }

    @Test
    public void testSetTarifaBasica() {
        valor.setTarifaBasica(150.0);
        assertEquals("A tarifa básica deve ser atualizada para 150.0", 150.0, valor.getTarifaBasica(), 0.001);
    }

    @Test
    public void testGetTarifaBusiness() {
        assertEquals("A tarifa business deve ser 200.0", 200.0, valor.getTarifaBusiness(), 0.001);
    }

    @Test
    public void testSetTarifaBusiness() {
        valor.setTarifaBusiness(250.0);
        assertEquals("A tarifa business deve ser atualizada para 250.0", 250.0, valor.getTarifaBusiness(), 0.001);
    }

    @Test
    public void testGetTarifaPremium() {
        assertEquals("A tarifa premium deve ser 300.0", 300.0, valor.getTarifaPremium(), 0.001);
    }

    @Test
    public void testSetTarifaPremium() {
        valor.setTarifaPremium(350.0);
        assertEquals("A tarifa premium deve ser atualizada para 350.0", 350.0, valor.getTarifaPremium(), 0.001);
    }

    @Test
    public void testGetValorPrimeiraBagagem() {
        assertEquals("O valor da primeira bagagem deve ser 50.0", 50.0, valor.getValorPrimeiraBagagem(), 0.001);
    }

    @Test
    public void testSetValorPrimeiraBagagem() {
        valor.setValorPrimeiraBagagem(60.0);
        assertEquals("O valor da primeira bagagem deve ser atualizado para 60.0", 60.0, valor.getValorPrimeiraBagagem(), 0.001);
    }

    @Test
    public void testGetValorBagagemAdicional() {
        assertEquals("O valor da bagagem adicional deve ser 25.0", 25.0, valor.getValorBagagemAdicional(), 0.001);
    }

    @Test
    public void testSetValorBagagemAdicional() {
        valor.setValorBagagemAdicional(30.0);
        assertEquals("O valor da bagagem adicional deve ser atualizado para 30.0", 30.0, valor.getValorBagagemAdicional(), 0.001);
    }

    @Test
    public void testCalcularTarifaTotalTarifaBasica() {
        double total = valor.calcularTarifaTotal(1, 2);
        assertEquals("A tarifa total com tarifa básica e 2 bagagens deve ser 175.0", 175.0, total, 0.001);
    }

    @Test
    public void testCalcularTarifaTotalTarifaBusiness() {
        double total = valor.calcularTarifaTotal(2, 3);
        assertEquals("A tarifa total com tarifa business e 3 bagagens deve ser 275.0", 300.0, total, 0.001);
    }

    @Test
    public void testCalcularTarifaTotalTarifaPremium() {
        double total = valor.calcularTarifaTotal(3, 1);
        assertEquals("A tarifa total com tarifa premium e 1 bagagem deve ser 300.0", 350.0, total, 0.001);
    }

}
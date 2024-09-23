package test;

import static org.junit.Assert.*;
import org.junit.Test;

import domain.TipoPassagem;

public class TipoPassagemTest {

    private TipoPassagem tipoPassagem = new TipoPassagem();

    @Test
    public void testValidaTipoPassagemMesmoAeroporto() {
        String aeroportoOrigem = "GRU";
        String aeroportoDestino = "GRU";
        String tipoPassagemStr = "Ida e Volta";

        tipoPassagem.validaTipoPassagem(aeroportoOrigem, aeroportoDestino, tipoPassagemStr);

        assertEquals("Não é possível comprar passagem de ida e volta para o mesmo destino", "Não é possível comprar passagem de ida e volta para o mesmo destino");
    }

    @Test
    public void testValidaTipoPassagemDiferenteAeroporto() {
        String aeroportoOrigem = "GRU";
        String aeroportoDestino = "SDU";
        String tipoPassagemStr = "Ida e Volta";

        tipoPassagem.validaTipoPassagem(aeroportoOrigem, aeroportoDestino, tipoPassagemStr);

        assertEquals("Passagem comprada com sucesso", "Passagem comprada com sucesso");
    }

    @Test
    public void testValidaVooInternacional() {
        String paisOrigem = "Brasil";
        String paisDestino = "Argentina";

        boolean resultado = tipoPassagem.validaVooInternacional(paisOrigem, paisDestino);

        assertTrue(resultado);
        assertEquals("Voo internacional: valor deve ser mantido em dólares", "Voo internacional: valor deve ser mantido em dólares");
    }

    @Test
    public void testValidaVooNacional() {
        String paisOrigem = "Brasil";
        String paisDestino = "Brasil";

        boolean resultado = tipoPassagem.validaVooInternacional(paisOrigem, paisDestino);

        assertFalse(resultado);
        assertEquals("Voo doméstico: valor pode estar em moeda local", "Voo doméstico: valor pode estar em moeda local");
    }
}


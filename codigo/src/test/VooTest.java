package test;

import static org.junit.Assert.*;
import org.junit.Test;

import domain.CompanhiaAerea;

import java.time.LocalDate;
import java.util.Optional;

import domain.Passagem;


public class VooTest {
    
    @Test
    public void testPesquisaVoo() {
        CompanhiaAerea companhia = new CompanhiaAerea("Latam", "12345678901", "latam@email.com", "20kg", true);
        Passagem passagem = new Passagem("AA1234", "GRU", "JFK", LocalDate.of(2024, 9, 25), null, companhia, "BRL", null);

        Optional<String> resultado = passagem.pesquisaVoo("GRU", "JFK", LocalDate.of(2024, 9, 25));
        assertTrue(resultado.isPresent());
        assertEquals("Voo AA1234 de GRU para JFK na data 25/09/2024", resultado.get());
    }

    @Test
    public void testPesquisaVooNaoEncontrado() {
        CompanhiaAerea companhia = new CompanhiaAerea("Latam", "12345678901", "latam@email.com", "20kg", true);
        Passagem passagem = new Passagem("AA1234", "GRU", "JFK", LocalDate.of(2024, 9, 25), null, companhia, "BRL", null);

        Optional<String> resultado = passagem.pesquisaVoo("GRU", "LAX", LocalDate.of(2024, 9, 25));
        assertFalse(resultado.isPresent());
    }
}

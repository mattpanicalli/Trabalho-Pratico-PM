package test;

import static org.junit.Assert.*;
import org.junit.Test;

import domain.CompanhiaAerea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import domain.Passagem;
import domain.Valor;

public class PassagemTest {

    @Test
    public void testPassagemConstructor() {
        CompanhiaAerea companhia = new CompanhiaAerea("Latam", "12345678901", "latam@email.com", "20kg", true);
        List<Valor> valores = new ArrayList<>();
        Passagem passagem = new Passagem("AA1234", "GRU", "JFK", LocalDate.of(2024, 9, 25), null, companhia, "BRL", valores);

        assertEquals("AA1234", passagem.getCodigoVoo());
        assertEquals("GRU", passagem.getAeroportoOrigem());
        assertEquals("JFK", passagem.getAeroportoDestino());
        assertEquals(LocalDate.of(2024, 9, 25), passagem.getDataHoraVoo());
        assertEquals(companhia, passagem.getCompanhiaAerea());
        assertEquals("BRL", passagem.getMoeda());
    }

    @Test
    public void testCalcularPrecoFinal() {
        CompanhiaAerea companhia = new CompanhiaAerea("Latam", "12345678901", "latam@email.com", "20kg", true);
        Passagem passagem = new Passagem("AA1234", "GRU", "JFK", LocalDate.of(2024, 9, 25), null, companhia, "BRL", null);

        passagem.calcularPrecoFinal("Ida e Volta", 1000);
    }

    @Test
    public void testCalcularTarifaTotalComVoos() {
        List<Valor> valores = new ArrayList<>();
        valores.add(new Valor(620, 0, 0, 0, 0));
        double tarifaTotal = Passagem.calcularTarifaTotalComVoos(valores, 1, 2);

        assertEquals(620, tarifaTotal, 0.001); 
    }

    @Test
    public void testPesquisaVoo() {
        CompanhiaAerea companhia = new CompanhiaAerea("Latam", "12345678901", "latam@email.com", "20kg", true);
        Passagem passagem = new Passagem("AA1234", "GRU", "JFK", LocalDate.of(2024, 9, 25), null, companhia, "BRL", null);

        String resultado = passagem.pesquisaVoo("GRU", "JFK", LocalDate.of(2024, 9, 25));
        assertEquals("AA1234 GRU JFK 2024-09-25", resultado);
    }

}

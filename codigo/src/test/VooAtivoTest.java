package test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import domain.CompanhiaAerea;
import domain.Voo;
import domain.VooAtivo;


public class VooAtivoTest {

    @Test
    public void testGerarVoosAtivos() {
        Voo vooBase = new Voo(
            "V001",
            "Aeroporto A",
            "Aeroporto B",
            LocalDate.now(),  
            "Nenhuma",
            new CompanhiaAerea("Cia", "12345", "cia@gmail", "sim", false)
        );

        VooAtivo vooAtivo = new VooAtivo(vooBase);

        List<Voo> voosGerados = vooAtivo.gerarVoosAtivos();

        assertEquals(31, voosGerados.size());

        assertEquals(vooBase.getDataHoraVoo(), voosGerados.get(0).getDataHoraVoo());

        LocalDate ultimaDataEsperada = LocalDate.now().plusDays(30);
        assertEquals(ultimaDataEsperada, voosGerados.get(voosGerados.size() - 1).getDataHoraVoo());
        
        for (Voo voo : voosGerados) {
            assertEquals(vooBase.getAeroportoOrigem(), voo.getAeroportoOrigem());
            assertEquals(vooBase.getAeroportoDestino(), voo.getAeroportoDestino());
            assertEquals(vooBase.getConexao(), voo.getConexao());
            assertEquals(vooBase.getCompanhiaAerea(), voo.getCompanhiaAerea());
        }
    }
}


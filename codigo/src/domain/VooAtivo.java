package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VooAtivo {
    private Voo voo;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public VooAtivo(Voo voo) {
        this.voo = voo;
        this.dataInicio = LocalDate.now(); 
        this.dataFim = dataInicio.plusDays(30);
    }

    public List<Voo> gerarVoosAtivos() {
        List<Voo> voosAtivos = new ArrayList<>();

        LocalDate dataAtual = voo.getDataHoraVoo();

        while (!dataAtual.isAfter(dataFim)) {
            Voo novoVoo = new Voo(
                voo.getCodigoVoo(),
                voo.getAeroportoOrigem(),
                voo.getAeroportoDestino(),
                dataAtual,
                voo.getConexao(),
                voo.getCompanhiaAerea()
            );
            voosAtivos.add(novoVoo);

            dataAtual = dataAtual.plusDays(1);
        }

        return voosAtivos;
    }
}





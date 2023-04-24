package br.com.alura.screenmatch.calculos;

import br.com.balura.screenmatch.modelos.Titulo;
import org.jetbrains.annotations.NotNull;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {

        return this.tempoTotal;
    }

    public void inclui(@NotNull Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " +titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
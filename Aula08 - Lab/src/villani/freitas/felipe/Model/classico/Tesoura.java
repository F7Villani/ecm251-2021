package villani.freitas.felipe.Model.classico;

import villani.freitas.felipe.Model.Jogada;

public class Tesoura extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Pedra);
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
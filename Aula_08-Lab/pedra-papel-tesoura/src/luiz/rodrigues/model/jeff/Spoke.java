package luiz.rodrigues.model.jeff;


import luiz.rodrigues.model.Jogada;
import luiz.rodrigues.model.classico.Papel;
import luiz.rodrigues.model.classico.Pedra;
import luiz.rodrigues.model.classico.Tesoura;


public class Spoke extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}
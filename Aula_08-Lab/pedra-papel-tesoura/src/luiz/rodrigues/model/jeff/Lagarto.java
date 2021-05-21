package luiz.rodrigues.model.jeff;

import luiz.rodrigues.model.Jogada;
import luiz.rodrigues.model.classico.Papel;
import luiz.rodrigues.model.classico.Pedra;
import luiz.rodrigues.model.classico.Tesoura;

public class Lagarto extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Spoke);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }
}
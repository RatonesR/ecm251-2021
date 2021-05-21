package luiz.rodrigues.model.classico;

import luiz.rodrigues.model.Jogada;
import luiz.rodrigues.model.jeff.Lagarto;
import luiz.rodrigues.model.jeff.Spoke;

public class Tesoura extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Spoke);
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}

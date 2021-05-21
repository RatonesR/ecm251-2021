package luiz.rodrigues.model.jeff;

import luiz.rodrigues.model.Jogada;
import luiz.rodrigues.model.classico.Papel;
import luiz.rodrigues.model.classico.Pedra;
import luiz.rodrigues.model.classico.Tesoura;


public class Spoke extends Jogada {
    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }
    @Override
    public String toString() {
        return "Spoke";
    }
}
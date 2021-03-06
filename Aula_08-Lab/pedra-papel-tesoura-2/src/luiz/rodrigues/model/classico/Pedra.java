package luiz.rodrigues.model.classico;

import luiz.rodrigues.model.Jogada;
import luiz.rodrigues.model.jeff.Lagarto;
import luiz.rodrigues.model.jeff.Spoke;

public class Pedra extends Jogada {

    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
package richardwollyce.maratonajava.javacore.Gassociacao.test;

import richardwollyce.maratonajava.javacore.Gassociacao.dominio.Jogador;
import richardwollyce.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}

package richardwollyce.maratonajava.javacore.Eblocosinicializacao.test;

import richardwollyce.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Beyblade");
        System.out.println("\n"+anime.getNome());
    }
}

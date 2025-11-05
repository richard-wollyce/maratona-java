package richardwollyce.maratonajava.javacore.Csobrecargametodos.test;

import richardwollyce.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball Z", "TV", 12, "Ação");
        anime.imprime();

    }
}

package Csobrecargametodos.test;

import Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Tv", 10);
        anime.init("Naruto", "Tv", 10, "Ação");
        anime.imprime();
    }
}

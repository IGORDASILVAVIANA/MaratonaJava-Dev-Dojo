package Dconstrutores.test;


import Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Tv", 10, "Ação");
        anime.imprime();
    }
}

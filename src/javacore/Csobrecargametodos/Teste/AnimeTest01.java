package javacore.Csobrecargametodos.Teste;

import javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("HighScholldxd" , "TV" , 300, "Adulto");
        anime.imprimir();
    }
}

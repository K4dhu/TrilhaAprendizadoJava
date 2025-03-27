package javacore.Dconstrutores.Teste;

import javacore.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "Acao" , 300, "Adulto");

        anime.init("HighScholldxd" , "TV" , 300, "Adulto");
        anime.imprimir();
    }
}

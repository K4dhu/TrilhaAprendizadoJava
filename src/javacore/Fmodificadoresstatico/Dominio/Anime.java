package javacore.Fmodificadoresstatico.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios = {1,2,3,4,5,6,7,8,9} ;

   static {
        System.out.println("Dentro do bloco");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {
        for( int episodio : Anime.episodios) {
            System.out.printf((episodio + " "));
        }
        System.out.println();

    }


    }





package javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9} ;



    public Anime() {
       for(int episodio : this.episodios) {
           System.out.print(episodio + " ");
       }
    }
    }




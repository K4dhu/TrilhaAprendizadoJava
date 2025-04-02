package javacore.bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome) {
        this.nome = nome;


    }
    public int  setIdade(int II) {
        if( II < 0)
            System.out.println("Idade Incorreta!");
        return II;
    }
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
}

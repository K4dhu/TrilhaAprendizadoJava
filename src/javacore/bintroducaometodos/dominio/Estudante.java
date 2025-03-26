package javacore.bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public String email;
    public int idade;
    public char sexo;
    public int matricula;

    public void imprimir(){
        System.out.println("------------------");
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.idade);
        }
    }


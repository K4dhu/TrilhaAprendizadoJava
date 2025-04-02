package javacore.Fmodificadoresstatico.Dominio;

public class Carro {
    private  String nome;
    private  double velocidadeMaxima;
    private   double velocidadeLimite = 250;


    public Carro(String nome, double velocidadeMaxima ) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void print() {
        System.out.println("---------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Maxima  " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite  "+ this.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public  double getVelocidadeLimite() {
        return this.velocidadeLimite;
    }
    public  void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
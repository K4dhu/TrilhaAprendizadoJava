package javacore.bintroducaometodos.dominio;

public class FuncionarioDoMes {
     private String nome;
     private int idade;
     private double [] salarios;
     private  double media;

    public void imprimirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double salario : salarios) {
            System.out.println(salario + "   ");
        }


    }
    public void mediaSalario() {
        for (double salario : salarios) {
            media += salario;
        }
        media = media/salarios.length;
        System.out.println("Media Salarial  " + media);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double[] getSalarios() {
        return salarios;
    }
    public double getMedia() {
        return media;
    }
}

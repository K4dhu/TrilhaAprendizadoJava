package javacore.bintroducaometodos.dominio;

public class FuncionarioDoMes {
     public String nome;
     public int idade;
     public double salario1;
     public double salario2;
     public  double salario3;

    public void imprimirDados(){
        System.out.println("Dados Funcionario");
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.printf("Salarios: %.2f, %.2f, %.2f%n",salario1, salario2, salario3);
        System.out.printf("Media Salarial:  %.2f%n", mediaSalario());

        System.out.println("Fim....");
    }
    public double mediaSalario() {
        return (salario1 + salario2 + salario3) / 3;
    }
}

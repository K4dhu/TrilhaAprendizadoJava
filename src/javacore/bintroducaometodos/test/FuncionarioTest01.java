package javacore.bintroducaometodos.test;
import javacore.bintroducaometodos.dominio.FuncionarioDoMes;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        FuncionarioDoMes funcionario = new FuncionarioDoMes();

        funcionario.nome = "Joao Victor";
        funcionario.idade = 20;
        funcionario.salario1 = 2500;
        funcionario.salario2 = 3000;
        funcionario.salario3 = 1500;

        funcionario.imprimirDados();




    }
}

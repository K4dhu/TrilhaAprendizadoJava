package javacore.bintroducaometodos.test;
import javacore.bintroducaometodos.dominio.FuncionarioDoMes;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        FuncionarioDoMes funcionario = new FuncionarioDoMes();

        funcionario.setNome("Joao Victor");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[] {2000, 4000, 7000});

        funcionario.imprimirDados();
        funcionario.mediaSalario();





    }
}

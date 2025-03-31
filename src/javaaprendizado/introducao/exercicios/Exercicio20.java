package javaaprendizado.introducao.exercicios;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Digite o valor da hora-aula: ");
        double hora = input.nextDouble();

        System.out.print("Aulas fornecidas no mes: ");
        int mes = input.nextInt();

        System.out.print("Digite o percentual de desconto do INSS (ex: 11 para 11%) : ");
        double desconto = input.nextDouble();

        double salarioBruto = hora * mes;

        double descontoInss = (desconto / 100) * salarioBruto;

        double salarioLiquido = salarioBruto - descontoInss;

        System.out.println("O valor do salario liquido é " + salarioLiquido);

    }
}

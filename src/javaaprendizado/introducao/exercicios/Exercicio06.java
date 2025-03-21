package javaaprendizado.introducao.exercicios;
import java.util.Scanner;
// Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20)

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMin = 1293.20;
        double salarioUsu;

        System.out.println("Digite o seu salario atual: ");
        salarioUsu = sc.nextDouble();
        double mediaSal = salarioUsu / salarioMin;

        System.out.printf("Voce recebe %.2f salarios minimos. %n", mediaSal);

        sc.close();





    }
}

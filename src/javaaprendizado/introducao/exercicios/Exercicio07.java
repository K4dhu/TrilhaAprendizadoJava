package javaaprendizado.introducao.exercicios;
import java.util.Scanner;
// Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valorDigi = sc.nextDouble();
        double reajuste = valorDigi * 0.05;
        double novovalor = valorDigi + reajuste;

        System.out.println("O valor ajustado é igual a " + novovalor);
        sc.close();
    }
}

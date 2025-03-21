package javaaprendizado.introducao.exercicios;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio04 {
    // Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int a = sc.nextInt();
        System.out.printf("Digite outro numero: ");
        int b = sc.nextInt();
        int c = 0;




        if (a == b) {
            int soma = a + b;
            c = soma;
        } else if (a != b) {
            int vezes = a * b;
            c = vezes;
        }
        System.out.println(c);

    }
}



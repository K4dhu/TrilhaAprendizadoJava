package javaaprendizado.introducao.exercicios;
import java.util.Scanner;
public class Exercicio05 {
    //  Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = sc.nextInt();
        int antecessor = a - 1;
        int sucessor = a + 1;
        System.out.println("O antecessor é " + antecessor + " E o sucessor é " + sucessor);

    }
}

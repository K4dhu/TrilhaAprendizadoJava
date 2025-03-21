package javaaprendizado.introducao.exercicios;
import java.util.Scanner;
// Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = sc.nextInt();

         if(numero1 % 2 == 0)
            System.out.println("O numero digitado é par");
         else
            System.out.println("O numero digitado é impar");

         if(numero1 < 0 )
             System.out.println("O numero digitado é negativo");
         else
             System.out.println("O numero digitado é positivo");




    }
}

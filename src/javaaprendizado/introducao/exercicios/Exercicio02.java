package javaaprendizado.introducao.exercicios;
import java.util.Scanner;
// Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o numero A: ");
        int a = sc.nextInt();
        System.out.printf("Digite o numero B: ");
        int b = sc.nextInt();
        System.out.printf("Digite o numero C: ");
        int c = sc.nextInt();
        int soma = a + b;

        if (soma < c)
            System.out.println("A soma e menor que " + c);
        else
            //System.out.println("A soma entre "+ a + b + "=" + "a" + soma);
            System.out.printf("A soma entre %d e % d e igual a %d", a, b , soma);


    }
}

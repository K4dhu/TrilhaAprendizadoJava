package javaaprendizado.introducao.exercicios;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os tres lados do triangulo");
        System.out.println("------------------------------------");

        System.out.print("Lado 1:  ");
        int a = input.nextInt();

        System.out.print("Lado 2: ");
        int b = input.nextInt();

        System.out.print("Lado 3: ");
        int c = input.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            // Classificação do triângulo
            if (a == b && b == c) {
                System.out.println("O triângulo é Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

    }
}

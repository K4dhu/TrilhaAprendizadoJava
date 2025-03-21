package javaaprendizado.introducao.exercicios;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio09ComFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor de A:");
        int numA = input.nextInt();
        System.out.println("Valor de B:");
        int numB = input.nextInt();
        System.out.println("Valor de C:");
        int numC = input.nextInt();
        int[] numeros = {numA, numB, numC};
        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }
    }
}
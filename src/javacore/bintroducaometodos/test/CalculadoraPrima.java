package javacore.bintroducaometodos.test;
import javacore.bintroducaometodos.dominio.CalcularPrimos;

import java.util.Scanner;
// Desafio; Criar uma calculadora que valide se um numero e primo ou nao
// retornar true se for e false se nao for

// Criar uma calculadora que recebe uma lista ou array e retorne toda essa lista x2
public class CalculadoraPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalcularPrimos prima = new CalcularPrimos();
        int [] array1 = new int[2];
        System.out.println("CalculadoraPrima");
        System.out.println("-------------------");

        System.out.printf("Digite um numero:  ");
            array1[0] = input.nextInt();

        System.out.printf("Digite outro numero: ");
            array1[1] = input.nextInt();

        System.out.println(array1[0] + " é primo? " + prima.ehPrimo(array1[0]));
        System.out.println(array1[1] + " é primo? " + prima.ehPrimo(array1[1]));

    }
}

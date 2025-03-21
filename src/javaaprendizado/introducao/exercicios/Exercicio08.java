package javaaprendizado.introducao.exercicios;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite F ou V  : ");
        char primeirovalor = sc.next().charAt(0);
        System.out.println("Digite F ou V : ");
        char segundoovalor = sc.next().charAt(0);
        boolean valor1 = (primeirovalor == 'v');
        boolean valor2 = (segundoovalor == 'v');

        if (valor1 && valor2)
            System.out.println("Ambos sao verdadeiros!");
        else if (!valor1 && !valor2)
            System.out.println("Ambos sao falsos");

        else
            System.out.println("Um e verdadeiro e outro falso");



    }
}
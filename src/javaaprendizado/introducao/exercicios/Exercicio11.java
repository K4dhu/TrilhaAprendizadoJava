package javaaprendizado.introducao.exercicios;
import java.util.Scanner;
//  10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota = sc.nextDouble();
        System.out.println("Digite uma nota2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite uma nota3: ");
        double nota3 = sc.nextDouble();

        double media = (nota + nota2 + nota3) /3;

        System.out.println("A media total foi de " + media);
    }
}

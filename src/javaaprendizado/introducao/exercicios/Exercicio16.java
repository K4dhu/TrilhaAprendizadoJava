package javaaprendizado.introducao.exercicios;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = input.nextInt();

        if(idade < 18)
            System.out.println(nome + " Voce é menor de idade! ");

        if (idade > 18 )
            System.out.println(nome + " Voce é maior de idade! ");

        else
            System.out.println("Digite sua idade corretamente!");


    }
}

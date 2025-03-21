package javaaprendizado.introducao.exercicios;
import java.util.Scanner;
 // Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição.


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        double formula =  peso / (altura * altura);
        System.out.println(formula);

        if(formula < 18.5)
        System.out.println("Abaixo do peso!");

        else if (formula >= 18.6 && formula < 24.9)
            System.out.println("Peso ideal!");

        else if (formula >= 25 && formula < 29.9)
            System.out.println("Levemente acima do peso!");

        else if (formula >= 30 && formula < 34.9)
            System.out.println("Obesidade grau I");

        else if (formula >= 35 && formula < 39.9 )
            System.out.println("Obesidade grau II(severa)");

        else
            System.out.println("Obesidade grau III (morbida)");
    }
}

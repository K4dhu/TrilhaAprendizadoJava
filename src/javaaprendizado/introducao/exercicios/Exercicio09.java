package javaaprendizado.introducao.exercicios;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int number1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int number2 = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int number3 = sc.nextInt();



        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);

            if (number2 > number3){
                System.out.println(number2);
                System.out.println(number3);
            } else {
                System.out.println(number3);
                System.out.println(number2);
            }}
        else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);

            if (number1 > number3) {
                System.out.println(number1);
                System.out.println(number3);
            } else {
                System.out.println(number3);
                System.out.println(number1);
            }
        } else {
            System.out.println(number3);
        } if (number1 > number2 ) {
            System.out.println(number1);
            System.out.println(number2);
         } else
            System.out.println(number2);
            System.out.println(number1);






    }
}
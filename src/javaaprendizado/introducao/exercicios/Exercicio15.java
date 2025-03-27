package javaaprendizado.introducao.exercicios;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();

        System.out.printf("Em qual ano voce nasceu?:  ");
        int anoNascimento = input.nextInt();

        int anosVividos = anoAtual - anoNascimento;
        int mesesVividos = anosVividos * 12;
        int diasVividos = anosVividos * 365;

        System.out.println("Voce ja viviou aproximadamente");

        System.out.println("Anos: " + anosVividos);
        System.out.println("Meses: " + mesesVividos);
        System.out.println("Dias: " + diasVividos);


    }
}

package javaaprendizado.introducao.exercicios;

public class Exercicio14 {
    public static void main(String[] args) {
        int [] numeros = {1,3,5,7,9} ;

        System.out.println("Total de numero pares é " + totalPares(numeros));


    }

    public static int totalPares (int[] numeros) {
        int total = 0;
        for (int i : numeros) {
            if (i % 2 == 0) {
                total++;
            }
            else
                System.out.println("NAO!");

        }

        return total;


    }

    }




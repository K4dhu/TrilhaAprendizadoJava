package javaaprendizado.introducao.introducao.Aula05.Aula07;

public class AulaArray03 {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        int[] numeros2 = {1, 2, 3, 4};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        for (int num : numeros2) {
            System.out.println(num);


        }
    }}

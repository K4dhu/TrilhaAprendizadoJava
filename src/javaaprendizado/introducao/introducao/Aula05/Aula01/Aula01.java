package javaaprendizado.introducao.introducao.Aula05.Aula01;

import javacore.Aintroducaoclasses.dominio.Carro;

public class Aula01 {
    public static void main(String[] args) {
        int numero1 = 23;
        int numero2 = 45;
        int soma = numero1 + numero2;
        System.out.println("O resultado de " + numero1 +" mais " + numero2 +" = a" +soma);
        Carro carrob = new Carro();
        carrob.ano = 1992;
        System.out.println(carrob);
    }
}

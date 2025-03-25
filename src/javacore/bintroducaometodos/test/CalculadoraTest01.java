package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.dominio.Calculadora;

import static javacore.bintroducaometodos.dominio.Calculadora.calcular;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calc2 = new Calculadora();


        int vari = calcular(10,20);
        System.out.println(vari);

        calc2.calcular2();
        System.out.println("Fim do Teste!");
    }
}

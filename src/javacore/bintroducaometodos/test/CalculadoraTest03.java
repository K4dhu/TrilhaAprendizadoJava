package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

       double resultado = calculadora.divideDoisNumeros(50,2);
        System.out.println(resultado);
        System.out.println("-------------------");
           calculadora.imprimiDivisaoNumeros(50,0);
    }
}

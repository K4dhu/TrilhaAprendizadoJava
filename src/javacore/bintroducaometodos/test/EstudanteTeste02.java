package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante print = new Estudante();

        estudante01.nome = "Carlos";
        estudante01.idade = 19;
        estudante01.email = "vhfspl23@gmail.com";

        estudante02.nome = "Stanley Papa";
        estudante02.email = "Stanleyborguespapagrandapinto@gmail.com";
        estudante02.idade = 23;

        estudante01.imprimir();



    }
}

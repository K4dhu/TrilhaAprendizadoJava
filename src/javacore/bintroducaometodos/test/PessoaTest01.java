package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "Neji";
        p1.idade = -1;
        p1.imprimi();
    }
}

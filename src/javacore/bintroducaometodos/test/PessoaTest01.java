package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

       // p1.nome = "Neji";
        p1.setNome("Neji");
        p1.setIdade(20);

     //    p1.imprimi();
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
    }
}

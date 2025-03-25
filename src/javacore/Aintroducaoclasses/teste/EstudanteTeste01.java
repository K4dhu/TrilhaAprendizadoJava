package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Allan";
        estudante.email = "allan@gmail.com";
        estudante.idade = 19;
        estudante.matricula = 2002;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);




    }
}

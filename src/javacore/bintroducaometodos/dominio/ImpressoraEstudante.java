package javacore.bintroducaometodos.dominio;

public class ImpressoraEstudante {

    public void imprimir(Estudante estudante) {
        System.out.println("_________---------_________-----____--_");

        System.out.println(estudante.nome);
        System.out.println(estudante.email);
        System.out.println(estudante.idade);
        estudante.nome = "Gotenks";

    }
}

package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.dominio.Estudante;
import javacore.bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        ImpressoraEstudante imp = new ImpressoraEstudante();
        Estudante est = new Estudante();
        Estudante est2 = new Estudante();

        est.nome = "Ichigo";
        est.email = "Ihigo@gmail,com";
        est.idade = 19;
        est.sexo = 'M';

        est2.nome = "Goku";
        est2.email = "Goku@gmail.com";
        est2.idade = 24;
        est2.sexo = 'M';

        imp.imprimir(est);
        imp.imprimir(est2);

        imp.imprimir(est);

    }

}
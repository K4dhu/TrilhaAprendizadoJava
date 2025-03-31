package javaaprendizado.introducao.exercicios;

public class Exercicio18 {
    public static void main(String[] args) {

        double francisco = 1.50;
        double sara = 1.10;

        double crescimentoFrancisco =  0.02;
        double crescimentoSara = 0.03;

        int anos = 0;

        while (francisco >= sara) {
            francisco += crescimentoFrancisco;
            sara += crescimentoSara;
            anos++;

        }
        System.out.println("Serão necessários " + anos + " anos para que Sara seja maior que Francisco.");
    }
}

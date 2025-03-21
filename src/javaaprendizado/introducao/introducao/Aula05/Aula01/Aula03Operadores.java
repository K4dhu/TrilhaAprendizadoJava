package javaaprendizado.introducao.introducao.Aula05.Aula01;

public class Aula03Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 30;
        float resultado = numero01 / (float) numero02;
    //    System.out.println(resultado);

        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezIgualQueAVinte = 10==20;
      //  System.out.println(isDezMaiorQueVinte);
       // System.out.println(isDezIgualQueAVinte);


        // && (AND) (E) ))  || (OR) (OU) ))  ! (NOT) (NAO)

        int idade = 19;
        float salario = 4000;
        boolean dentroDaLei = idade > 30 && salario >= 4000;
        boolean foraDalei = idade < 30 && salario <= 3000;
      //  System.out.println(foraDalei);

        float saldoContaUm = 2000;
        float saldoContaDois = 6000;
        double valorPlay = 4000;
        boolean isComprarPlay = saldoContaUm > valorPlay  || saldoContaDois > valorPlay;
        System.out.println(isComprarPlay);

        // = += -=

        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        //

        int contador = 0;
        contador++;
        --contador;
        System.out.println(contador);


    }
}

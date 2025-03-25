package javacore.bintroducaometodos.dominio;

public class Calculadora {

    public static int calcular(int a, int b){
        System.out.println("Iniciando funcao de soma: ");
        return a+b;

    }

    public void calcular2(){

        System.out.println(20-10);
    }

    public void calcular3(int num1, int num2){
        System.out.println(num1 * num2 / + num1);
    }
    public double divideDoisNumeros(double num1, double num2) {

        if (num2 == 0)
            return 0;
        else
        return num1/num2;
    }
    public void imprimiDivisaoNumeros(double num1, double num2) {
         if(num2 == 0)
             System.out.println("Nao e possivel realizar essa divisao!");
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera doisDOisNumeros");
        System.out.println("num1 " + num2);
    }


}

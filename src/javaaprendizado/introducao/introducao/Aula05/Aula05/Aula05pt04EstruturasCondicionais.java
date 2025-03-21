package javaaprendizado.introducao.introducao.Aula05.Aula05;

public class Aula05pt04EstruturasCondicionais {
    public static void main(String[] args) {
        double salarioAnual = 6000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorimposto =0;
        if(salarioAnual <= 34712){
        valorimposto = salarioAnual * primeiraFaixa;
        } else if(salarioAnual >= 34712 && salarioAnual <= 68508){
            valorimposto = salarioAnual * segundaFaixa;
        } else{
           valorimposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorimposto);
    }
}

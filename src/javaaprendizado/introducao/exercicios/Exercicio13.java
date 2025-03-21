package javaaprendizado.introducao.exercicios;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o valor do produto: ");
            double valorproduto = sc.nextDouble();

            menu();
            int forma = sc.nextInt();

            if (forma == 1) {
                pagamentoAvista(valorproduto);
            }
            else if (forma == 2)
                pagamentoCreditoV(valorproduto);

            else if (forma == 3 )
                pagamentDuasVz(valorproduto);
            else
                pagamentTres(valorproduto);
        }


    }
    public static void menu() {
        System.out.println("1------Dinheiro");
        System.out.println("2------Credito");
        System.out.println("3------Parcelar em 2 vzs, sem juros");
        System.out.println("4------Parcelar em 3 vzs ou mais, com acrescimo de 10%");
        System.out.println("Escolha a forma de pagamento: ");
    }
     public static double pagamentoAvista(double valorproduto2) {
         double vista = (15 * valorproduto2) / 100;
         double valorTotal =  valorproduto2 - vista;
         System.out.println("O valor com 15% de desconto é " + valorTotal);

         return valorTotal;

     }
    public static double pagamentoCreditoV(double valorproduto) {
        double creditoVist = (10 * valorproduto) / 100;
        double valorTotal =  valorproduto - creditoVist;
        System.out.println("O valor com 10% de desconto é " + valorTotal);

        return valorTotal;

    }
    public static double pagamentDuasVz(double valorproduto) {
        double parcelarDois = valorproduto / 2;
        System.out.println("O valor parcelado em 2 vzs fica em duas parcelas de  " + parcelarDois);

        return parcelarDois;


    }
    public static double pagamentTres(double valorproduto) {
        double parcelaTres = (10 * valorproduto) / 100 + valorproduto;
        double parcela = parcelaTres /3;
        System.out.println(parcela);

        return parcela;
    }




    }



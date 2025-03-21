package javaaprendizado.introducao.introducao.Aula05.Aula06;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        // condicao valorParcela >= 1000;
       double valorCarro = 30000    ;
        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela = valorCarro / parcela;
            if( valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " RS " +valorParcela);
        }
    }
}

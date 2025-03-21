package javaaprendizado.introducao.introducao.Aula05.Aula05;

public class Aula05EstruturasCondicionaisPT01 {
    public static void main(String[] args) {
        int idade =11;
        boolean isAutorizoacompra = idade >= 18;
        if(isAutorizoacompra)  {
            System.out.println("Quantas voce quer?");
        }

        if(isAutorizoacompra == false); // ou !
            System.out.println("Voce nao pode beber!");


    }
}

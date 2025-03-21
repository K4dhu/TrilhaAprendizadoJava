package javaaprendizado.introducao.introducao.Aula05.Aula05;

public class Aula05pt5EstruturaCondicional {
    public static void main(String[] args) {
        // impra o dia da semana. considerando 1 como domingo
        byte dia = 34;
        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Quar");
                break;
            case 5:
                System.out.println("Quin");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Error!!!");

    }
} }

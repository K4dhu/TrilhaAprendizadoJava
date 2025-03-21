package javaaprendizado.introducao.introducao.Aula05.Aula05;

public class Aula05ExercicioSwitchPT06 {
    public static void main(String[] args) {
        // dado os valores de 1 a 7, imprima se é dia util ou final de semana
        // considerando 1 como domingo;
        byte dia = 4;
        switch (dia){
            case 1:
                System.out.println("Doming, Final de semana!");
                break;
            case 2:
                System.out.println("Segunda, dia util");
                break;
            case 3:
                System.out.println("Terc, dia util");
                break;
            case 4:
                System.out.println("Quar, dia util");
                break;
            case 5:
                System.out.println("Quint, dia util");
                break;
            case 6:
                System.out.println("Sex, dia util");
                break;
            case 7:
                System.out.println("Sabado, dia util");
                break;
            default:
                System.out.println("Digite um numero correto! ");
                break;

        // uma logica mais limpa
//        byte dias = 2;
//        switch (dias){
//            case 1:
//            case 7:
//                System.out.println("FDS");
//                break;
//            case 2:
//            case 3 :
//            case 4 :
//            case 5:
//            case 6:
//                System.out.println("Dia util");
//                break;
//            default:
//                System.out.println("Opcao Invalida");
//

    }
} }

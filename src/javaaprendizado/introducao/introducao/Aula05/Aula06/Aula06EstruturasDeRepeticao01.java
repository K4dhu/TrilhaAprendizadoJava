package javaaprendizado.introducao.introducao.Aula05.Aula06;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
    int contador = 0;
    while (contador <100){
        System.out.println(++contador);
    }
    do {
        System.out.println("dentro do do-while");
    }while (contador <10);

    for(int i=0; i<10; i ++){
        System.out.println("For" +i);

    }
    }

}

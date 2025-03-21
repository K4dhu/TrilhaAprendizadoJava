package javaaprendizado.introducao.introducao.Aula05.Aula05;

public class Aula05estruturasCondicionaisPT02 {
    public static void main(String[] args) {
        int idade = 15;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }    else
        categoria = "Categoria Adulta";
        System.out.println(categoria);


    }
}
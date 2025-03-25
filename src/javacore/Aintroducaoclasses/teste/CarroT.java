package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroT {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "Cherry-QQ";
        carro1.modelo = "Cherry";
        carro1.ano = 2015;
        carro2.nome = "Ford Ka";
        carro2.modelo = "Ford";
        carro2.ano = 2022;
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}

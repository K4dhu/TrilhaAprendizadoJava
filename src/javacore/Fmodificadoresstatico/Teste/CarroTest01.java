package javacore.Fmodificadoresstatico.Teste;

import javacore.Fmodificadoresstatico.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW I3" , 280  );
        Carro carro2 = new Carro("Ford Fusion", 260);
        Carro carro3 = new Carro("Palio" , 150);

        carro.setVelocidadeLimite(300);

        carro.print();
        carro2.print();
        carro3.print();
    }
}

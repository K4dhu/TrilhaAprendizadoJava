package javacore.bintroducaometodos.dominio;

public class CalcularPrimos {

    public boolean ehPrimo(int numero){
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(numero) ; i++) {
            if (numero % i == 0) {
                return false;
            }

        }
    return true;
    }

}

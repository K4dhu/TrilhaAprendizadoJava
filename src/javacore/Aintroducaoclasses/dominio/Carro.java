package javacore.Aintroducaoclasses.dominio;

public class Carro {
   public String nome;
  public  int ano;
   public String modelo;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

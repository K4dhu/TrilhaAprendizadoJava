package javaaprendizado.introducao.DesafioCarros.Dominio;

public class VeiculoUm {
    private String especie;
    private String placa;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private double cargaMaxemKg;
    private double altura;
    private double largura;
    private double profundida;

    public VeiculoUm(String especie, String placa, String marca, String modelo , int anoModelo, int anoFabricacao, double altura, double largura) {
        this.especie =  especie;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.altura = altura;
        this.largura = largura;
    }

        public void impriVeiculos() {
            System.out.println("Especie: " + especie);
            System.out.println("Placa: " + placa);
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano Modelo: " + anoModelo);
            System.out.println("Ano Fabricacao: " + anoFabricacao);
            System.out.println("Altura: " + altura);
            System.out.println("Largura: " + largura);

        }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getCargaMaxemKg() {
        return cargaMaxemKg;
    }

    public void setCargaMaxemKg(double cargaMaxemKg) {
        this.cargaMaxemKg = cargaMaxemKg;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundida() {
        return profundida;
    }

    public void setProfundida(double profundida) {
        this.profundida = profundida;
    }
}

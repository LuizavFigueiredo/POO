// src/Carro.java
/**
 * Classe que representa um Carro.
 */
public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    /**
     * Construtor para inicializar um Carro.
     *
     * @param marca  Marca do carro.
     * @param modelo Modelo do carro.
     * @param cor    Cor do carro.
     * @param placa  Placa do carro.
     */
    public Carro(String marca, String modelo, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    // Getters e setters
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s, Modelo: %s, Cor: %s, Placa: %s", marca, modelo, cor, placa);
    }
}

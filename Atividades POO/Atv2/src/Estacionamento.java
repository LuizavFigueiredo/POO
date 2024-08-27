// src/Estacionamento.java
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um Estacionamento.
 */
public class Estacionamento {
    private String endereco;
    private long cep;
    private List<Carro> carros;

    /**
     * Construtor para inicializar um Estacionamento.
     *
     * @param endereco Endereço do estacionamento.
     * @param cep      CEP do estacionamento.
     */
    public Estacionamento(String endereco, long cep) {
        this.endereco = endereco;
        this.cep = cep;
        this.carros = new ArrayList<>();
    }

    /**
     * Adiciona um carro ao estacionamento.
     *
     * @param carro Carro a ser adicionado.
     */
    public void adicionarCarro(Carro carro) {
        if (carros.size() < 50) {
            carros.add(carro);
        } else {
            System.out.println("Estacionamento está cheio.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Endereço: %s, CEP: %d\n", endereco, cep));
        sb.append("Carros no estacionamento:\n");
        for (Carro carro : carros) {
            sb.append(carro.toString()).append("\n");
        }
        return sb.toString();
    }
}

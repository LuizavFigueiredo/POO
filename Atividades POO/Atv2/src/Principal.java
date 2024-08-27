// src/Principal.java
public class Principal {
    public static void main(String[] args) {
        // Limpa o terminal (para sistemas Unix/Linux/Mac)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Criação dos carros
        Carro carro1 = new Carro("Hyundai", "HB20", "preto", "BEE4F00");
        Carro carro2 = new Carro("Chevrolet", "Onix", "cinza", "FUN2M33");
        Carro carro3 = new Carro("Ford", "Ka", "vermelho", "GEZ0W35");

        // Criação do estacionamento
        Estacionamento estacionamento = new Estacionamento("Rua Avestruz", 90001007);

        // Adiciona os carros ao estacionamento
        estacionamento.adicionarCarro(carro1);
        estacionamento.adicionarCarro(carro2);
        estacionamento.adicionarCarro(carro3);

        // Exibe informações do estacionamento
        System.out.println(estacionamento);
    }
}

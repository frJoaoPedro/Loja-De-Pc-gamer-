// Classe que representa peças do pc gamer pikazao
public class Peca {

    private String nome;
    private String marca;
    private int preco;

    // Construtor recebe os três atributos que as pecas vao ter
    public Peca(String nome, String marca, int preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    // Getters — compreendi que é a única forma de acessar os dados privados de fora da classe
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getPreco() {
        return preco;
    }
}

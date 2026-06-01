import java.util.ArrayList;

// Classe que representa um computador e gerencia suas peças
public class Computador {

    private String modelo;
    private ArrayList<Peca> pecas;

    // Construtor recebe o nome/modelo do computador
    public Computador(String modelo) {
        this.modelo = modelo;
        this.pecas = new ArrayList<>();
    }

    // Adiciona uma peça à lista
    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }

    // Remove uma peça pelo nome (sem diferenciar maiúsculas/minúsculas)
    public boolean removerPeca(String nome) {
        for (int i = 0; i < pecas.size(); i++) {
            if (pecas.get(i).getNome().equalsIgnoreCase(nome)) {
                pecas.remove(i);
                return true;
            }
        }
        return false;
    }

    // Busca peças cujo nome contém o texto informado
    public ArrayList<Peca> buscarPorNome(String texto) {
        ArrayList<Peca> encontradas = new ArrayList<>();
        for (Peca p : pecas) {
            if (p.getNome().toLowerCase().contains(texto.toLowerCase())) {
                encontradas.add(p);
            }
        }
        return encontradas;
    }

    // Soma o preço de todas as peças
    public int calcularTotal() {
        int total = 0;
        for (Peca p : pecas) {
            total += p.getPreco();
        }
        return total;
    }

    // Retorna true se houver pelo menos uma peça cadastrada
    public boolean possuiPecas() {
        return !pecas.isEmpty();
    }

    // Exibe o modelo do computador e todas as suas peças
    public void listarPecas() {
        System.out.println("Computador: " + modelo);
        System.out.println("-----------------------------");
        for (Peca p : pecas) {
            System.out.println("- " + p.getNome() + " | " + p.getMarca() + " | R$ " + p.getPreco());
        }
    }
}

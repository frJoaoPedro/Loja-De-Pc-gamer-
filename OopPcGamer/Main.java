import java.util.ArrayList;
import java.util.Scanner;

// Classe principal — responsável apenas pelo menu e interação com o usuário
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computador computador = new Computador("Meu PC");

        String opcao;

        do {
            exibirMenu();
            System.out.print("Opcao: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    adicionarPeca(scanner, computador);
                    break;
                case "2":
                    listarPecas(computador);
                    break;
                case "3":
                    System.out.println("Valor total: R$ " + computador.calcularTotal());
                    break;
                case "4":
                    buscarPeca(scanner, computador);
                    break;
                case "5":
                    removerPeca(scanner, computador);
                    break;
                case "0":
                    System.out.println("Saindo... Ate logo!");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }

        } while (!opcao.equals("0"));

        scanner.close();
    }

    // Exibe o menu de opções
    private static void exibirMenu() {
        System.out.println("\n=============================");
        System.out.println("   ORIENTED PROGRAMMING STORE");
        System.out.println("=============================");
        System.out.println("1 - Adicionar peca");
        System.out.println("2 - Listar pecas");
        System.out.println("3 - Ver valor total");
        System.out.println("4 - Buscar peca por nome");
        System.out.println("5 - Remover peca");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
    }

    // Lê os dados da nova peça e adiciona ao computador
    private static void adicionarPeca(Scanner scanner, Computador computador) {
        System.out.print("Nome da peca: ");
        String nome = scanner.nextLine();

        System.out.print("Marca da peca: ");
        String marca = scanner.nextLine();

        System.out.print("Preco da peca: ");
        int preco;
        try {
            preco = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Preco invalido. Use apenas numeros inteiros.");
            return;
        }

        computador.adicionarPeca(new Peca(nome, marca, preco));
        System.out.println("Peca adicionada com sucesso!");
    }

    // Exibe as peças cadastradas ou avisa que não há nenhuma
    private static void listarPecas(Computador computador) {
        if (!computador.possuiPecas()) {
            System.out.println("Nenhuma peca cadastrada.");
        } else {
            computador.listarPecas();
        }
    }

    // Busca peças pelo nome parcial e exibe os resultados
    private static void buscarPeca(Scanner scanner, Computador computador) {
        System.out.print("Digite parte do nome: ");
        String texto = scanner.nextLine();

        ArrayList<Peca> encontradas = computador.buscarPorNome(texto);

        if (encontradas.isEmpty()) {
            System.out.println("Nenhuma peca encontrada.");
        } else {
            System.out.println("Pecas encontradas:");
            for (Peca p : encontradas) {
                System.out.println("- " + p.getNome() + " | " + p.getMarca() + " | R$ " + p.getPreco());
            }
        }
    }

    // Remove uma peça pelo nome
    private static void removerPeca(Scanner scanner, Computador computador) {
        System.out.print("Nome da peca para remover: ");
        String nome = scanner.nextLine();

        if (computador.removerPeca(nome)) {
            System.out.println("Peca removida com sucesso.");
        } else {
            System.out.println("Peca nao encontrada.");
        }
    }
}

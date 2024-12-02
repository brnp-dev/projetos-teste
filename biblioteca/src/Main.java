import classes.livro;
import classes.biblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        biblioteca biblioteca = new biblioteca(null);
        int option;

        do {
            System.out.println("");
            System.out.println("Bem-Vindo(a) a nossa biblioteca!!");
            System.out.println("O que deseja??");
            System.out.println("1 - Adicionar um livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Buscar um livro pelo título");
            System.out.println("4 - Emprestar um livro");
            System.out.println("5 - Devolver um livro");
            System.out.println("6 - Sair do programa");
            System.out.print("Digite o número da opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("Preenca os campos:");

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Ano de publicação: ");
                    int anoPublicação = scanner.nextInt();
                    scanner.nextLine();

                    livro livro = new livro(titulo, autor, anoPublicação, false);
                    biblioteca.adicionarLivro(livro);
                    break;
                }
                case 2: {
                    System.out.println("Listando livros...");
                    biblioteca.listarLivros();
                    break;
                }
                case 3: {
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();

                    biblioteca.buscarLivroTitulo(titulo);
                    break;
                }
                case 4: {
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();

                    biblioteca.emprestarLivro(titulo);
                    break;
                }
                case 5: {
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();

                    biblioteca.devolverLivro(titulo);
                    break;
                }
                default: System.out.println("Opção inválida!!");
            }
            
        } while (option != 6);

        scanner.close();
    }
}

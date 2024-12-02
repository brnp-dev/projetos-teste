package classes;

import java.util.ArrayList;

public class biblioteca {
    private ArrayList<livro> livros;

    public biblioteca(ArrayList<livro> livros) {
        this.livros = new ArrayList<>();

    }

    public void adicionarLivro(livro livro) {
        this.livros.add(livro);
        System.out.println("Livro adicionado na biblioteca!");
    }

    public void listarLivros() {
        if (this.livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado!!");
        } else {
            for(int i=0; i<this.livros.size(); i++) {
                System.out.println(livros.get(i));
            }
        }
    }

    public void buscarLivroTitulo(String titulo) {
        boolean encontrado = false;
        if (!livros.isEmpty()) {
            for(livro livro :livros) {
                if (livro.getTitulo().equals(titulo)) {
                    System.out.println(livro);
                    encontrado = true;
                }
            }
        } else {
            System.out.println("Nenhum livro encontrado em nossa biblioteca!!");
        }
        if(!encontrado) {
            System.out.println("Livro não encontrado");
        }
    }

    public void emprestarLivro(String titulo) {
        boolean encontrado = false;
        if (!this.livros.isEmpty()) {
            for(livro livro : livros) {
                if (livro.getTitulo().equals(titulo)) {
                    encontrado = true;
                    livro.emprestar();
                }
            }
        } else {
            System.out.println("Nenhum livro encontrado em nossa biblioteca!!");
        }
        if(!encontrado) {
            System.out.println("Livro não encontrado");
        }
    }

    public void devolverLivro(String titulo) {
        boolean encontrado = false;
        if (!this.livros.isEmpty()) {
            for(livro livro: livros) {
                if (livro.getTitulo().equals(titulo)) {
                    encontrado = true;
                    livro.devolver();
                }
            }
        } else {
            System.out.println("Nenhum livro encontrado em nossa biblioteca!!");
        }
        if(!encontrado) {
            System.out.println("Livro não encontrado");
        }
    }

}

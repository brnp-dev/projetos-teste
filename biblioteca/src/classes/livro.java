package classes;

public class livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;

    public livro(String titulo, String autor, int anoPublicacao, boolean emprestado) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = emprestado;
    }

    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicação() {
        return anoPublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicação) {
        this.anoPublicacao = anoPublicação;
    }

    public void emprestar() {
        if (this.emprestado == false) {
            this.emprestado = true;
            System.out.println("Emprestimo realizado!!");
        } else {
            System.out.println("Este livro já está emprestado");
        }
    }

    public void devolver() {
        if (this.emprestado == true) {
            this.emprestado = false;
            System.out.println("Livro devolvido!!");
        } else {
            System.out.println("Este livro não faz parte de um emprestimo");
        }
    }
     
}

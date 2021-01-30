package br.net.benfatto.biblioteca.model;

/**
 * @author Murilo Oliveira
 */
public class Livro {
    public static int _id = 1;

    private int id;
    private String titulo;
    private String autor;
    private Categoria categoria;
    private boolean disponivel;

    public Livro(String titulo, String autor, Categoria categoria) {
        this.id = _id++;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria=" + categoria +
                ", disponivel=" + disponivel +
                '}';
    }
}

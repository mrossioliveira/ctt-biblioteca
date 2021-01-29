package br.net.benfatto.biblioteca.model;

/**
 * @author Murilo Oliveira
 */
public class Livro {
    private int id;
    private String titulo;

    public Livro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}

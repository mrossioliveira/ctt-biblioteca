package br.net.benfatto.biblioteca.model;

/**
 * @author Murilo Oliveira
 */
public class Categoria {
    public static int _id = 1;

    private final int id;
    private String nome;

    public Categoria(String nome) {
        this.id = _id++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\t Nome: " + nome;
    }
}

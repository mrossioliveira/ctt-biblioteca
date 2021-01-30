package br.net.benfatto.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Murilo Oliveira
 */
public class Usuario {
    public static int _id = 1;

    private final int id;
    private String nome;
    private String telefone;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.id = _id++;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public Usuario(String nome, String telefone) {
        this.id = _id++;
        this.nome = nome;
        this.telefone = telefone;
        this.livrosEmprestados = new ArrayList<>();
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\t Nome: " + nome + "\t Telefone: " + telefone + "\t N. de livros emprestados " + this.livrosEmprestados.size();
    }
}

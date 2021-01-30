package br.net.benfatto.biblioteca;

import br.net.benfatto.biblioteca.model.Categoria;
import br.net.benfatto.biblioteca.model.Livro;
import br.net.benfatto.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Murilo Oliveira
 */
public class Biblioteca implements CadastraUsuario {
    private List<Usuario> usuarios;
    private List<Livro> livros;
    private List<Categoria> categorias;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    @Override
    public void cadastrarUsuario(Usuario usuario) {
        if (usuario != null) {
            this.usuarios.add(usuario);
        }
    }

    public void criarLivro(Livro livro) {
        if (livro != null) {
            this.livros.add(livro);
        }
    }

    public void criarCategoria(Categoria categoria) {
        if (categoria != null) {
            this.categorias.add(categoria);
        }
    }


}

package br.net.benfatto.biblioteca;

import br.net.benfatto.biblioteca.model.Categoria;
import br.net.benfatto.biblioteca.model.Livro;
import br.net.benfatto.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Murilo Oliveira
 */
public class Biblioteca {
    public static final int LIVRO_DISPONIVEL = 1;
    public static final int LIVRO_INDISPONIVEL = 2;
    public static final int LIVRO_NAO_EXISTENTE = -1;

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

    public List<Livro> listarLivros() {
        return livros;
    }

    public List<Categoria> getCategorias() {
        return this.categorias;
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (usuario != null && usuario.getNome() != null) {
            this.usuarios.add(usuario);
        }
    }


    public void cadastrarUsuario(String nome) {
        if (nome != null) {
            this.usuarios.add(new Usuario(nome));
        }
    }

    public void removerUsuario(int idUsuario) {
        boolean foiRemovido = false;
        List<Usuario> todosUsuarios = this.usuarios;

        for (Usuario usuario : todosUsuarios) {
            if (usuario.getId() == idUsuario) {
                this.usuarios.remove(usuario);
                foiRemovido = true;
            }
        }

        if (!foiRemovido) {
            System.out.println("Usuário com id " + idUsuario + " não encontrado");
        }
    }

    public void cadastrarLivro(Livro livro) {
        if (livro != null) {
            this.livros.add(livro);
        }
    }

    public void cadastrarCategoria(Categoria categoria) {
        if (categoria != null) {
            this.categorias.add(categoria);
        }
    }

    public boolean removerCategoria(int idCategoria) {
        for (Categoria categoria : this.getCategorias()) {
            if (categoria.getId() == idCategoria) {
                this.categorias.remove(categoria);
                return true;
            }
        }
        return false;
    }

    /**
     * Remove um livro da lista de livros se existir.
     *
     * @param idLivro id do livro que se deseja remover
     * @return 0 se removido com sucesso, 2 se não disponível ou -1 se não encontrado
     */
    public int removerLivro(int idLivro) throws Exception {
        Livro livro = this.findLivro(idLivro);
        if (livro != null) {
            if (!livro.isDisponivel()) {
                return LIVRO_INDISPONIVEL;
            }

            this.livros.remove(livro);
            return LIVRO_DISPONIVEL;
        }
        return LIVRO_NAO_EXISTENTE;
    }

    public void emprestarLivro(int idLivro, int idUsuario) throws Exception {
        // veriricar se o livro existe
        Livro livro = this.findLivro(idLivro);
        Usuario usuario = this.findUsuario(idUsuario);

        // verifico se posso emprestar
        usuario.getLivrosEmprestados().add(livro);

        // verifico se o livro existe e esta disponivel
        if (livro.isDisponivel()) {
            // posso emprestar o livro
            livro.setDisponivel(false);
        }
    }

    public void devolverLivro() {

    }

    private Livro findLivro(int idLivro) throws Exception {
        // verifica todos os livros
        for (Livro livro : this.getLivros()) {
            if (livro.getId() == idLivro) {
                return livro;
            }
        }
        throw new Exception("Livro não existe");
    }

    private Usuario findUsuario(int idUsuario) throws Exception {
        for (Usuario usuario : this.getUsuarios()) {
            if (usuario.getId() == idUsuario) {
                return usuario;
            }
        }
        throw new Exception("Usuário não existe");
    }


    private int livroDisponivel(int idLivro) throws Exception {
        Livro livro = this.findLivro(idLivro);
        return livro.isDisponivel() ? LIVRO_DISPONIVEL : LIVRO_INDISPONIVEL;
    }
}

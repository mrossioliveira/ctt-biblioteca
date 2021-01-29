package br.net.benfatto.biblioteca;

import br.net.benfatto.biblioteca.model.Livro;

import java.util.Arrays;
import java.util.List;

/**
 * @author Murilo Oliveira
 */
public class Acervo {
    private List<Livro> livros;

    public List<Livro> getLivros() {
        return Arrays.asList(new Livro(1, "A Startup Enxuta"), new Livro(2, "Rápido e Devagar"));
    }
}

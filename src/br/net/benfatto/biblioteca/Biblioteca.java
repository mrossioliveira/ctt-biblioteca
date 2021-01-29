package br.net.benfatto.biblioteca;

import br.net.benfatto.biblioteca.model.Usuario;

import java.util.Arrays;
import java.util.List;

/**
 * @author Murilo Oliveira
 */
public class Biblioteca {
    List<Usuario> usuarios;

    public List<Usuario> getUsuarios() {
        return Arrays.asList(new Usuario(1, "Murilo"), new Usuario(1, "Fernanda"));
    }
}

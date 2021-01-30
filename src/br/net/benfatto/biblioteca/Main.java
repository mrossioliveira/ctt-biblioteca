package br.net.benfatto.biblioteca;

import br.net.benfatto.biblioteca.model.Usuario;

/**
 * @author Murilo Oliveira
 */
public class Main {
    public static void main(String[] args) {
        final int VER_USUARIOS = 1;
        final int CRIAR_USUARIOS = 2;
        final int VER_LIVROS = 3;
        final int CRIAR_LIVROS = 4;

        Biblioteca biblioteca = new Biblioteca();
        Console console = new Console();

        System.out.println("Sistema de Gerenciamento de Biblioteca");
        int opcaoMenu;
        do {
            // seleciona a opcao de menu
            opcaoMenu = console.mostrarMenu();

            switch (opcaoMenu) {
                case VER_USUARIOS:
                    console.mostrarUsuarios(biblioteca.getUsuarios());
                    break;
                case CRIAR_USUARIOS:
                    Usuario usuario = console.criarUsuario();
                    biblioteca.cadastrarUsuario(usuario);
                    break;
                case VER_LIVROS:
                    // TODO
                    break;
                case CRIAR_LIVROS:
                    // TODO
                    break;
            }
        } while (opcaoMenu != 0);
    }
}

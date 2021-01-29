package br.net.benfatto.biblioteca;

import br.net.benfatto.biblioteca.model.Livro;
import br.net.benfatto.biblioteca.model.Usuario;

import java.util.List;
import java.util.Scanner;

/**
 * @author Murilo Oliveira
 */
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Acervo acervo = new Acervo();
        Console console = new Console();

        System.out.println("Sistema de Gerenciamento de Biblioteca");
        int opcaoMenu;
        do {
            // seleciona a opcao de menu
            opcaoMenu = console.mostrarMenu();

            if (opcaoMenu == 1) {
                // printar a lista de clientes
                List<Usuario> usuarios = biblioteca.getUsuarios();
            } else if (opcaoMenu == 2) {
                // printar lista de livros
                List<Livro> livros = acervo.getLivros();
            }
        } while (opcaoMenu != 0);
    }
}

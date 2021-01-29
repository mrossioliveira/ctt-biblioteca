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
        int opcaoMenu = 0;

        Biblioteca biblioteca = new Biblioteca();
        Acervo acervo = new Acervo();
        Console console = new Console();

        System.out.println("Sistema de Gerenciamento de Biblioteca");

        do {
            // seleciona a opcao de menu
            opcaoMenu = console.mostrarMenu();

            if (opcaoMenu == 1) {
                List<Usuario> usuarios = biblioteca.getUsuarios();
                // printar a lista de clientes
                usuarios.forEach(System.out::println);
            } else if (opcaoMenu == 2) {
                List<Livro> livros = acervo.getLivros();
                // printar lista de livros
                livros.forEach(System.out::println);
            }
        } while (opcaoMenu != 0);
    }
}

package br.net.benfatto.biblioteca;

import br.net.benfatto.biblioteca.model.Usuario;

import java.util.List;
import java.util.Scanner;

/**
 * @author Murilo Oliveira
 */
public class Console {

    public int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Ver usuários");
        System.out.println("2. Criar usuários");
        System.out.println("3. Ver livros");
        System.out.println("4. Criar livros");
        System.out.println("0. Sair");

        return scanner.nextInt();
    }

    public Usuario criarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o nome do usuário?");
        String nome = scanner.nextLine();
        return new Usuario(nome);
    }

    public void mostrarUsuarios(List<Usuario> usuarios) {
        usuarios.forEach(System.out::println);
    }
}

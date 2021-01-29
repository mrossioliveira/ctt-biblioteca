package br.net.benfatto.biblioteca;

import java.util.Scanner;

/**
 * @author Murilo Oliveira
 */
public class Console {

    public int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Ver usuários");
        System.out.println("2. Ver livros");
        System.out.println("0. Sair");

        return scanner.nextInt();
    }

}

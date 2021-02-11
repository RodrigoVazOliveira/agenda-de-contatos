package br.dev.rvz;

import java.util.Scanner;

/**
 * entrada e saída de dados no terminal
 * */
public class IO {
    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void output(String texto) {
        System.out.println(texto);
    }
}

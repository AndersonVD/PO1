package Aulas.aula1_introducao_java;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para ser exibido no terminal:");
        int numero = entrada.nextInt();
        System.out.println("Número digitado é:\n" + numero);
        // novo comentario
    }
}

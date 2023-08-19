package Atividades.atividade01;

import java.util.Scanner;
/*
 * Faça um Programa que calcule e 
 * mostre a área de um quadrado.
 */

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o lado do quadrado: ");
        int lado_quadrado = scanner.nextInt();
        System.out.println("Área do quadrado: " + lado_quadrado * lado_quadrado);
        scanner.close();
    }
}

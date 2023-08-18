package Atividades.atividade01;

import java.util.Scanner;
/* 
 * 6. Faça um Programa que peça o raio de um círculo, 
 *  calcule e mostre sua área.
 * 
 * A = pi * r^2
 */

public class ex06 {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o raio do círculo: ");
        int raio = scanner.nextInt();
        scanner.close();
        double area = pi * (raio * raio);
        System.out.println("Resultado é: " + area);
    }
}

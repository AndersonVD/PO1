package Atividades.atividade01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número da soma: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número da soma: ");
        int numero2 = entrada.nextInt();
        int soma = numero1 + numero2;
        System.out.println("O resultado da soma é: " + soma);
    }
}

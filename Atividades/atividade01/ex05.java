package Atividades.atividade01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os metros para ser convertido em cm:");
        double metros = entrada.nextDouble();
        System.out.println("Em cm o resultado é: " + (metros * 100));

    }
}

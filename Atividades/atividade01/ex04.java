package Atividades.atividade01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite cada um dos quatro números da média em sequencia:");
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        double nota4 = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Resultado da média é: " + media);
    }
}

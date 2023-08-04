package Atividades.atividade01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite cada um dos quatro números da média em sequencia:");
        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();
        float nota4 = entrada.nextFloat();

        System.out.println("Qual sua frequência");
        float freq = entrada.nextFloat();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (freq < 75) {
            System.out.println("Aluno reprovado por frequência: " + freq + " e media: " + media);
        } else {
            System.out.println("Resultado da média é: " + media);

            if (media >= 6) {
                System.out.println("Aluno aprovado com a média: " + media + " e frequência " + freq);
            } else {
                System.out.println("Aluno reprovado com a média: " + media + " e frequência " + freq);
            }
        }

        entrada.close();
    }
}

package Aulas.prova1_serieNumerica;

import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicita o valor de n até que seja maior ou igual a 3
        do {
            System.out.print("Digite o valor de n (deve ser maior ou igual a 3): ");
            n = scanner.nextInt();
            if (n < 3) {
                System.out.println("O valor de n deve ser maior ou igual a 3");
            }
        } while (n < 3);

        int[] serie = new int[n];
        serie[0] = 1; // a1
        serie[1] = 1; // a2

        // Calcula a série
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 2] + serie[i - 1];
        }

        // Apresenta a série
        System.out.println("Série numérica:");
        for (int valor : serie) {
            System.out.print(valor + " ");
        }
        System.out.println();

        // Calcula e apresenta somatória, média, maior e menor valor
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int valor : serie) {
            soma += valor;
            if (valor > maior)
                maior = valor;
            if (valor < menor)
                menor = valor;
        }

        double media = (double) soma / n;

        System.out.println("Somatória da série: " + soma);
        System.out.println("Média da série: " + media);
        System.out.println("Maior valor da série: " + maior);
        System.out.println("Menor valor da série: " + menor);

        scanner.close();
    }
}

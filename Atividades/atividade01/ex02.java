package Atividades.atividade01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para ser exibido no terminal:");
        int numero = entrada.nextInt();
        System.out.println("Número digitado é:\n" + numero);
    }
}

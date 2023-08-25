package Aulas.aula1_introducao_java;

import java.util.Scanner;

/*
- Estrutura da Linguagem Java (JVM, compilação, interpretação, ...);
o código java é codificando dentro de um arquivo .java, então o compilador
criar o arquivo .class que é um ByteCode, esse arquivo será utilizado pelo interpreador 
para conseguir realizar as instruções do código que estão lá descritas.

- Entrada e Saída;
Scanner para realizar as entradas de dados vindas do usuário;
System.out.println para enviar o dado para a tela(temirnal);

- Variáveis e Constantes;
(int|bool|String...)  var = value

Podemos atribuir valores dessa forma
int a, b, c;
a = b = c = 10;

- Seleção (IF, ELSE, ...);
- Repetição (FOR, WHILE, ...);
- Vetor (array unidimensional);
- Matriz (array multidimensional); 
 */

public class Study {
    public static void main(String[] args) {
        vogais_switch();
        // int[] list1 = new int[10];
        // int[] list2 = new int[10];
        // int[][] numeros = { list1, list2 };
        // for (int i = 0; i < numeros.length; i++) {
        // for (int j = 0; j < numeros[i].length; j++) {
        // System.out.println(i + " : " + j + " : " + numeros[i][j]);
        // }
        // }

    }

    public static void vogais_switch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma leta: ");
        String letra = scanner.nextLine();
        scanner.close();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("é");
                break;
            default:
                System.out.println("não é");
        }
        // switch (key) {
        // case value:

        // break;

        // default:
        // break;
        // }

    }

    public static void vogais_loop() {
        Scanner scanner = new Scanner(System.in);
        String[] vogais = { "a", "e", "i", "o", "u" };
        System.out.println("Digite uma leta: ");
        String letra = scanner.nextLine();
        boolean isVogal = false;
        for (String vogal : vogais) {
            if (letra.equals(vogal)) {
                isVogal = true;
                System.out.println("Sim a letra é uma vogal");
            }
            continue;
        }
        if (!isVogal) {
            System.out.println("Não é uma vogal");
        }
    }

}

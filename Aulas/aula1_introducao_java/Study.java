package Aulas.aula1_introducao_java;

import java.util.HashMap;

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
        int[] list1 = new int[10];
        int[] list2 = new int[10];
        int[][] numeros = { list1, list2 };
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(i + " : " + j + " : " + numeros[i][j]);
            }
        }

    }

}

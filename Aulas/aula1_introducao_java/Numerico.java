package Aulas.aula1_introducao_java;

public class Numerico {
    public static void main(String[] args) {
        int[] novo = new int[5];
        novo[0] = 1;
        novo[1] = 2;
        novo[2] = 3;
        novo[3] = 4;
        novo[4] = 5;
        System.out.println(novo[novo.length - 1]);
        // Scanner entrada = new Scanner(System.in);
        // System.out.println("Entre com o valor de N: ");
        // int nValue = entrada.nextInt();
        // do {
        // if (nValue < 3) {
        // System.out.println("Valor tem q ser menor ou igual a 3");
        // nValue = entrada.nextInt();
        // }
        // } while (nValue < 3);
        // entrada.close();
        // int[] vetor = new int[nValue];
        // for (int i = 0; i < vetor.length; i++) {
        // vetor[i] = (nValue - 2) + (nValue - 1);
        // System.out.println(vetor[i]);
        // }
        // int soma = 0;
        // for (int numero : vetor) {
        // soma += numero;
        // }
        // double media = soma / nValue;
        // int maiorValor = 0;
        // for (int numero : vetor) {
        // if (maiorValor < numero) {
        // maiorValor = numero;
        // }
        // }
        // int menorValor = 0;
        // for (int numero : vetor) {
        // if (menorValor > numero) {
        // menorValor = numero;
        // }
        // }
        // System.out.println("Maior valor: " + maiorValor);
        // System.out.println("Menor valor: " + menorValor);
        // System.out.println("Soma: " + soma);
        // System.out.println("Media: " + media);
    }
}

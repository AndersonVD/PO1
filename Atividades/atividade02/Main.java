package Atividades.atividade02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Constantes
        final float tipo1 = (float) 127.90;
        final float tipo2 = (float) 258.98;
        final float tipo3 = (float) 344.34;
        final float metros_pintados = (float) 4.76;

        // Principal
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor para H:");
        float h = entrada.nextFloat();
        System.out.println("Digite o valor para ab:");
        float ab = entrada.nextFloat();

        float base = ab + ab;
        float area_base = base * base;
        float volume = (float) ((area_base / 3) * h);
        float a1 = (float) Math.sqrt((float) (Math.pow(h, 2)) + (float) (Math.pow(ab, 2)));
        float area_triangulo = (((ab + ab)) * a1) / 2;
        float area_total = area_base + (area_triangulo * 4);
        float litros = area_total / metros_pintados;

        int latas = (int) Math.ceil(area_total / 18);

        int tipo_tinta = 0;
        float valor = 0;
        do {
            System.out.println("Informe o tipo da tinta(1,2 ou 3): ");
            tipo_tinta = entrada.nextInt();
            if ((tipo_tinta <= 0) || (tipo_tinta > 3))
                System.out.println("Valor inválido. Insira novamente");
        } while ((tipo_tinta <= 0) || (tipo_tinta > 3));

        switch (tipo_tinta) {
            case 1:
                valor = tipo1;
                break;
            case 2:
                valor = tipo2;
                break;
            case 3:
                valor = tipo3;
                break;
        }

        float preco = latas * valor;

        System.out.println("ab: " + ab);
        System.out.println("h: " + h);
        System.out.println("a1: " + a1);
        System.out.println("area_triangulo: " + area_triangulo);
        System.out.println("area_base: " + area_base);
        System.out.println("area_total: " + area_total);
        System.out.println("tipo_tinta: " + tipo_tinta);
        System.out.println("litros: " + litros);
        System.out.println("latas: " + latas);
        System.out.println("preco: " + preco);
        System.out.println("volume: " + volume);
        entrada.close();
    }
}

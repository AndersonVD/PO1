package Atividades.googleCharts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de números na amostra: ");
        int quantidadeAmostras = entrada.nextInt();

        System.out.print("Informe o valor mínimo possível: ");
        int valorMin = entrada.nextInt();

        System.out.print("Informe o valor máximo possível: ");
        int valorMax = entrada.nextInt();

        List<Integer> xData = new ArrayList<>();
        List<Integer> yData = new ArrayList<>();
        for (int i = 1; i <= quantidadeAmostras; i++) {
            xData.add(i);
            int randomNumber = (int) (Math.random() * (valorMax - valorMin + 1)) + valorMin;
            yData.add(randomNumber);
        }

        createHTML(xData, yData);

        System.out.println("Arquivo HTML atualizado.");
    }

    private static void createHTML(List<Integer> xData, List<Integer> yData) {
        // read a html file in the project
        StringBuilder html_page = new StringBuilder();
        try {
            File file = new File("src/Atividades/googleCharts/index.html");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                html_page.append(line).append("\n");
            }
            reader.close();

            // atualize o conteúdo do arquivo html
            String updatePage = html_page.toString();
            StringBuilder valuesStringBuilder = new StringBuilder();
            valuesStringBuilder.append("[\n");
            for (int i = 0; i < xData.size(); i++) {
                valuesStringBuilder.append("    ['").append(xData.get(i)).append("', ").append(yData.get(i))
                        .append("],\n");
            }
            valuesStringBuilder.append("]");
            updatePage = updatePage.replace("{ $VALORES }", valuesStringBuilder.toString());

            FileWriter writer = new FileWriter(file);
            writer.write(updatePage);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package Atividades.fitadna;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProcessDNA {
    public static void main(String[] args) {
        String inputFileName = "src/Atividades/fitadna/fitaDNA.txt";
        String outputFileName = "src/Atividades/fitadna/outDNA.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            List<String> invalidFitas = new ArrayList<>();
            String line;
            int totalFitas = 0;
            int validFitas = 0;

            while ((line = reader.readLine()) != null) {
                totalFitas++;
                line = line.trim();

                if (isValidDNA(line)) {
                    validFitas++;
                    String complementarySequence = gerarComplemento(line);
                    writer.write(complementarySequence);
                    writer.newLine();
                } else {
                    invalidFitas.add(line);
                    writer.write("****FITA INVALIDA " + totalFitas + " - " + line);
                    System.out.println("****FITA INVALIDA " + totalFitas + " - " + line);
                    writer.newLine();
                }
            }

            // Imprimir informações no console
            System.out.println("Total de fitas do arquivo original: " + totalFitas);
            System.out.println("Número de fitas válidas: " + validFitas);
            System.out.println("Número de fitas inválidas: " + invalidFitas.size());

            // Escrever fitas inválidas no arquivo de saída

            // Fechar os arquivos
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Função para verificar se uma fita é válida
    public static boolean isValidDNA(String sequence) {
        String validBases = "ATCG";
        for (char base : sequence.toCharArray()) {
            if (validBases.indexOf(base) == -1) {
                return false;
            }
        }
        return true;
    }

    // Função para gerar a fita complementar
    public static String gerarComplemento(String sequence) {
        StringBuilder complementarySequence = new StringBuilder();
        for (int i = sequence.length() - 1; i >= 0; i--) {
            char base = sequence.charAt(i);
            switch (base) {
                case 'A':
                    complementarySequence.append('T');
                    break;
                case 'T':
                    complementarySequence.append('A');
                    break;
                case 'C':
                    complementarySequence.append('G');
                    break;
                case 'G':
                    complementarySequence.append('C');
                    break;
            }
        }
        return complementarySequence.toString();
    }
}

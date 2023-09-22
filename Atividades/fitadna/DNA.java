package Atividades.fitadna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DNA {

    public static void main(String[] args) {
        ArrayList<String> file = readFile("src/Atividades/fitadna/fitaDNA.txt");
        System.out.println("Total de fitas: " + file.size());
        System.out.println(file.get(0));

    }

    // public static void tratarFitaDNA()

    public static void writeFile(String content) {

    }

    public static ArrayList<String> readFile(String path) {
        try {
            ArrayList<String> fitasDNA = new ArrayList<String>();
            File myObj = new File("src/Atividades/fitadna/fitaDNA.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                fitasDNA.add(data);
            }
            myReader.close();
            return fitasDNA;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }

    }
}

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "plik.txt";
        File file = new File(fileName);


        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Pisze sobie jakiś tekst hahha");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Występił błąd zapisu");
        }

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            System.out.println(text);
        }

        scanner.close();


    }
}

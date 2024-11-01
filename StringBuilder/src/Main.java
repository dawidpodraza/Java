import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //przerobić program na zadanie z JavaStart w daleszej części :)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile wyrazów chcesz wprowadzić: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Podaj %d wyrazów: ", choice);
        String[] tabOfWords = new String[choice];
        for (int i = 0; i < tabOfWords.length; i++) {
            tabOfWords[i] = scanner.nextLine();
        }

        for (String x : tabOfWords) {
            System.out.println(x);
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile wyrazów chcesz wprowadzić: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Podaj %d wyrazów: ", choice);

        String[] tabOfWords = new String[choice];

        StringBuilder finalWorld = new StringBuilder();

        for (int i = 0; i < tabOfWords.length; i++) {
            tabOfWords[i] = scanner.nextLine();
            finalWorld.append(tabOfWords[i].charAt(tabOfWords[i].length() - 1));

        }

        System.out.println(finalWorld);



    }
}

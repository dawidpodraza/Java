import java.util.Scanner;

public class Main {
    private static final int MAGIC_NUMBER = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int index = 1;
        int sum = 0;

        while (index != 0) {
            System.out.println("Podaj liczbę: ");
            index = scanner.nextInt();
            scanner.nextLine();
            sum = sum + index;

        }

        System.out.println("Suma: " + sum);

        
    }
}


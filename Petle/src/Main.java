import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int sum = 0;
        int liczba = scanner.nextInt();



        for (int i = 0; i < liczba ; i++) {
            System.out.println("Dalej: ");
            sum = sum+ scanner.nextInt();
        }

        System.out.println("Wyniki dodawania: "+sum);



    }
}

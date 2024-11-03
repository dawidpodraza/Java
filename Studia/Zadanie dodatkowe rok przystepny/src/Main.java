import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok: ");
        int year = scanner.nextInt();


        checkYear(year);


    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Rok przystępny");
        } else {
            System.out.println("Rok nieprzystępny");
        }
    }
}

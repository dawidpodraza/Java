import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();



        System.out.println("Cześć "+firstName+" "+lastName);
        System.out.println("Masz "+age+" lat.");

    }
}

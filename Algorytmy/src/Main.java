import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int choice = 0;

        while(choice<100){
            System.out.println("Podaj liczbę: ");
            int number = scanner.nextInt();
            choice = number;
            sum = sum + number;
        }

        if(sum%2==0){
            System.out.println("Suma parzysta!");
        }else{
            System.out.println("Suma nieparzysta!");
        }
    }
}

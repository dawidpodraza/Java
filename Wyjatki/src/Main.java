import java.util.InputMismatchException;
import java.util.Scanner;

// NAPISAĆ TO SAMO WYKORZYSTUJĄC STAŁE STATYCZNE I SWITCH CASE !!!!!!!!!!!! W CALCULATE
// PAMIĘTAĆ O WYJĄTKACH ZGODNIE Z TREŚCIĄ ZADANIE Z JAVASTART

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instructions instructions = new Instructions();
        Calculate calculate = new Calculate();

        try {
            instructions.firstMessage();
            calculate.setFirstNumber(scanner.nextDouble());
        } catch (InputMismatchException e) {
            System.err.println("Miałeś/aś podać tylko liczbę !");
            System.exit(0);
        }
        instructions.secondMessage();
        char z = scanner.next().charAt(0);

        try {
            instructions.thirdMessage();
            calculate.setSecondNumber(scanner.nextDouble());
        } catch (InputMismatchException e) {
            System.err.println("Miałeś/aś podać tylko liczbę !");
        }

        try {
            Calculate.equation(calculate.getFirstNumber(), z, calculate.getSecondNumber());
        } catch (UnknownOperatorException e) {
            System.err.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Nie dzielimy przez ZERO !!!");
        }

    }
}

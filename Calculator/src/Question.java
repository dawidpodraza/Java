import java.util.Scanner;

public class Question {
    private double x;
    private double y;
    private String z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    void questionToUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę: ");
        x = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Co chcesz zrobić? + - * /");
        z = scanner.next();
        System.out.println("Podaj drugą liczbę: ");
        y = scanner.nextDouble();

    }
}

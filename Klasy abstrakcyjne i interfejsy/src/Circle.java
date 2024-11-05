import java.util.Scanner;

public class Circle implements Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        System.out.println("Pole koła:");
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód koła:");
        return 2 * PI * radius;
    }

    @Override
    public void askForData() {
        System.out.println("Podaj promień koła.");
        Scanner scanner = new Scanner(System.in);
        setRadius(scanner.nextDouble());

    }
}

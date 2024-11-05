import java.util.Scanner;

public class Rectangle implements Shape {
    private double length;
    private double width;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        System.out.println("Pole prostokąta:");
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód prostokąta:");
        return (length + width) * 2;
    }

    @Override
    public void askForData() {
        System.out.println("Podaj długość prostokąta.");
        Scanner scanner = new Scanner(System.in);
        setLength(scanner.nextDouble());
        System.out.println("Podaj szerokość prostokąta.");
        setWidth(scanner.nextDouble());
    }
}

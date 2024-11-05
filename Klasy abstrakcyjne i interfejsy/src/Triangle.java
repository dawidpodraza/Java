import java.util.Scanner;

public class Triangle implements Shape{
    private double lengthA;
    private double lengthB;
    private double lengthC;
    private double base;
    private double heigh;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    @Override
    public double calculateArea() {
        System.out.println("Pole trójkąta:");
        return 0.5*base*heigh;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód trójkąta:");
        return lengthA+lengthB+lengthC;
    }

    @Override
    public void askForData() {
        System.out.println("Podaj długość boku A trójkąta.");
        Scanner scanner = new Scanner(System.in);
        setLengthA(scanner.nextDouble());
        System.out.println("Podaj długość boku B trójkąta.");
        setLengthB(scanner.nextDouble());
        System.out.println("Podaj długość boku C trójkąta");
        setLengthC(scanner.nextDouble());
        System.out.println("Podaj długość podstawy trójkąta.");
        setBase(scanner.nextDouble());
        System.out.println("Podaj wysokość h trójkąta.");
        setHeigh(scanner.nextDouble());
    }
}

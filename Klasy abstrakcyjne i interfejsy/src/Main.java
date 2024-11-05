public class Main {
    public static void main(String[] args) {
        // Obsłużyć wyjątki w tym programie !!!!!!!!!!

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        circle.askForData();

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        rectangle.askForData();

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        triangle.askForData();

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

    }
}

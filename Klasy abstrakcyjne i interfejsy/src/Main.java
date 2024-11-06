import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        // Obsłużyć wyjątki w tym programie !!!!!!!!!!

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        try{
            circle.askForData();
        }catch(InputMismatchException e){
            System.out.println("Podano złe dane");

        }

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());


        try{
            rectangle.askForData();
        }catch(InputMismatchException e){
            System.out.println("Podano złe dane");
            System.exit(0);
        }

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());


        try{
            triangle.askForData();
        }catch(InputMismatchException e){
            System.out.println("Podano złe dane");
            System.exit(0);
        }

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

    }
}

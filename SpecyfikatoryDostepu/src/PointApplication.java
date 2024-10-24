import points.*;
import pointControls.*;
import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {

        Point point = new Point(0,0);
        PointController pointController = new PointController();
        Scanner scanner = new Scanner(System.in);



        System.out.println("0-left 1-right 2-up 3-down");
        System.out.print("Your choice:");
        int direction = scanner.nextInt();

        /*
        switch(direction){
            case 0 -> pointController.minusX(point);
            case 1 -> pointController.addX(point);
            case 2 -> pointController.addY(point);
            case 3 -> pointController.minusY(point);
            default -> System.out.println("Zły wybór");
        }
        */
        switch(direction){
            case 0 : pointController.minusX(point);
                break;
            case 1 : pointController.addX(point);
                break;
            case 2 : pointController.addY(point);
                break;
            case 3 : pointController.minusY(point);
                break;
            default : System.out.println("Zły wybór");
                break;
        }


        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}
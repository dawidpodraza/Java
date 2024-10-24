import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numberUser = scanner.nextInt();



        int number = switch (numberUser){
            case 1 -> 1;
            case 2 -> 2;
            default -> 0;
        };

        System.out.println(number);
    }
}
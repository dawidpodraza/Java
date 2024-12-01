import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();

        getNumberFromUserToArray(list1);
        System.out.println(list1);
        System.out.println("Suma liczb w tablicy: "+sumNumberFromArray(list1));

    }


    private static void getNumberFromUserToArray(List<Double> list1) {
        String choice = "";
        while (!choice.equals("exit")) {
            System.out.println("Zakończ program - napisz 'exit'");
            System.out.println("Podaj liczbę: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextLine();
            try{
                list1.add(Double.valueOf(choice));
            }catch(NumberFormatException e){
                System.out.println("Nie podano liczy ...kończe program ");
            }

        }
    }

    public static Double sumNumberFromArray(List<Double> list){
        Double sum = (double) 0;
        for (int i = 0; i < list.size() ; i++) {
            sum= sum +list.get(i);
        }
        return sum;
    }
}

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkDay(2024,11,9);


    }
    public static void checkDay(int year,int month,int day){
        LocalDate localDate = LocalDate.of(year, month, day);

        String dayOfWeek = localDate.getDayOfWeek().toString();

        System.out.println(dayOfWeek);

    }
}

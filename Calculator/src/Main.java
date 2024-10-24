import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Question question = new Question();
        Counter counter = new Counter();



        question.questionToUser();
        counter.count(question.getX(),question.getY(),question.getZ());


    }
}
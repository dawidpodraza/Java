import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tabOfNumbers = {4,3,2,6,8,1,3,7,8,9,10,10};
        Arrays.sort(tabOfNumbers);

        Mediana mediana = new Mediana();
        mediana.countMedian(tabOfNumbers);
        System.out.println(mediana.getMediana());
    }
}

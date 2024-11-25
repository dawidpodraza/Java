import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] table = {21, 34, 5, 9, 78, 7, 8, 1, 9, 11, 13};

        reverse(table);

        System.out.println(Arrays.toString(table));


    }

    public static void reverse(int[] items) {
        int temp = 0;
        for (int i = 0; i < items.length / 2; i++) {
            temp = items[i];
            items[i] = items[items.length - i - 1];
            items[items.length - i - 1] = temp;
        }
    }
}

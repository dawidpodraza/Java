public class Main {
    public static void main(String[] args) {

        count(3); // pierwsza metoda z if

        System.out.println(count2(3)); // metoda rekurencyjna
    }

    public static void count(int number) {
        int result = 0;
        while (number > 0) {
            result = result +number;
            number--;
        }

        System.out.println(result);

    }

    public static int count2(int number) {
        int result = 0;
        if (number > 0) {
            result = number + count2(number - 1);
        }
        return result;
    }
}

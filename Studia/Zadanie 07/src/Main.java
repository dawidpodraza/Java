public class Main {

    public static void main(String[] args) {

        System.out.println(convert(5, 4.23));

    }

    public static double convert(double euro, double euroPlnRatio) {
        return euro * euroPlnRatio;
    }
}
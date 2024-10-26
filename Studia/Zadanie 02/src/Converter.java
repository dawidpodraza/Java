public class Converter {
    public static void main(String[] args) {
        double priceInEuro = 5.0;
        double euroToPlnRatio = 4.25;
        double priceInPln=0;

        priceInPln = priceInEuro * euroToPlnRatio;
        System.out.println(priceInPln);


    }
}

public class Main {
    public static void main(String[] args) {
        Product product1= new Product("Zupa","Amigo",2.20);
        Product product2= new Product("Zupa","Knorr",2.20);

        System.out.println(product1.compareTo(product2));
    }
}

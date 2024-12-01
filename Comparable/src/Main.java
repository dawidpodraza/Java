import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product product1= new Product("Kiszka","Amigo",2.20);
        Product product2= new Product("Zupa","Knorr",3.20);
        Product product3= new Product("Kotlet","Knorr",32.20);
        Product product4= new Product("Ziemniak","Knorr",1.20);

        System.out.println(product1.compareTo(product2));

        Integer[] table = {3, 34, 56, 8, 9, 1, 4, 7, 8, 9, 0, 10};

        Arrays.sort(table, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });


        Product[] tableOfProducts={product1,product2,product3,product4};

        Arrays.sort(tableOfProducts, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        });

        System.out.println(Arrays.toString(tableOfProducts));



    }
}

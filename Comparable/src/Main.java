import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Product product1= new Product("Zupa","Amigo",2.20);
//        Product product2= new Product("Zupa","Knorr",2.20);
//
//        System.out.println(product1.compareTo(product2));

        Integer[] table = {3, 34, 56, 8, 9, 1, 4, 7, 8, 9, 0, 10};

        Arrays.sort(table, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
        System.out.println(Arrays.toString(table));

        Arrays.sort(table);


        System.out.println(Arrays.toString(table));
    }
}

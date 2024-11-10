import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] table = {3435,6786,8907,21, 32, 12, 3, 5, 1, 19, 23,200,500,32,78};

        Sortable sorter = new Sortable() {

            public void sort(int[] tab) {
                boolean changed = false;
                for (int i = 0; i < tab.length - 1; i++) {
                    int leftNumber = tab[i];
                    int rightNumber = tab[i + 1];
                    if (leftNumber > rightNumber) {
                        tab[i] = rightNumber;
                        tab[i + 1] = leftNumber;
                        changed = true;
                    }
                    if (changed) {
                        sort(tab);
                    }
                }
            }
        };
        sorter.sort(table);
        System.out.println(Arrays.toString(table));
    }
}

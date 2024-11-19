public class Main {
    public static void main(String[] args) {
        int[] tab = {21, 4, 67, 34, 12, 3, 4, 234, 1};

        sort(tab);

        for (int x : tab) {
            System.out.println(x);
        }


    }

    public static int[] sort(int[] tab) {
        int temp = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < (tab.length - i); j++) {
                if (tab[j - 1] > tab[j]) {
                    temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;

                }
            }
        }
        return tab;
    }
}


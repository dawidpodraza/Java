public class Main {
    public static void main(String[] args) {
        int[] table1 = {9, 4, 2, 1, 34, 6, 89, 100};

        selectionSort(table1);

        for (int x:table1){
            System.out.println(x);
        }
    }

    public static void selectionSort(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            int index = i;
            for (int j = index+1; j < tab.length; j++) {
                if(tab[j]<tab[index]){
                    index=j;
                }
            }
            int temp = tab[index];
            tab[index]=tab[i];
            tab[i]=temp;

        }
    }
}

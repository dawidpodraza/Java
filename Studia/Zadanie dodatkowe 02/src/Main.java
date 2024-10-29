public class Main {
    public static void main(String[] args) {

        String[] tablica = {"Pierwszy","Drugi","Trzeci","Czwarty"};


        String[] reverse = reverse(tablica);
        print(reverse);
    }

    public static String[] reverse(String[] items) {
        String[] reverse = new String[items.length];
        int j=0;
        for (int i = items.length-1; i >= 0; i--) {
            reverse[j] =items[i];
            j++;
        }
        return reverse;
    }

    public static void print(String[] items) {
        System.out.print("Table: ");
        for (String item : items) {
            System.out.print(item+" ");
        }
    }
}

import java.util.Arrays;

public class DynamicTable {

    double[] table = new double[0];

    public void addItem(double number) {
        double[] newItems = new double[table.length + 1];
        int index = 0;
        for (double item : table) {
            newItems[index] = item;
            index++;
        }
        newItems[newItems.length - 1] = number;
        table = newItems;
    }

    public void deleteItem(int deleteIndex) {
        double[] newItems = new double[table.length - 1];
        int index = 0;

        for (int i = 0; i < newItems.length; i++) {
            newItems[index] = table[i];
            index++;


            try {
                if (newItems[i] == newItems[deleteIndex]) {
                    newItems[i] = table[i + 1];
                }
            } catch (ArrayIndexOutOfBoundsException _) {

            }

        }
        table = newItems;
    }

    @Override
    public String toString() {
        return "Tablica: " + Arrays.toString(table);
    }
}



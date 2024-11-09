import java.sql.Array;
import java.util.Arrays;

public class UniqueTable {

    private double[] table = {12, 4, 5, 67, 8};


    public void addItem(double newItem) {
        double[] newTable = new double[table.length + 1];
        double[] oldTable = new double[table.length];
        boolean check = false;

        int index = 0;
        for (double x : table) {
            newTable[index] = x;
            oldTable[index] = x;
            index++;
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i] == newItem) {
                check = true;
                break;
            }

        }
        if (check) {
            table = oldTable;
        } else {
            newTable[newTable.length - 1] = newItem;
            table = newTable;
        }


    }

    public void deleteItem(double deleteItem) {
        double[] newTable = new double[table.length - 1];
        double[] oldTable = new double[table.length];
        boolean check = false;

        int index = 0;
        for (double x : table) {

            oldTable[index] = x;
            index++;
        }


        int index2 = 0;

        for (int i = 0; i < table.length; i++) {
            if (table[i] == deleteItem) {
                check = true;
            }
        }
        if (check) {
            for (int j = 0; j < table.length; j++) {
                if (table[j] == deleteItem) {
                    continue;
                } else if (table[j] != deleteItem) {
                    newTable[index2] = table[j];
                    index2++;
                }

            }
            table = newTable;
        } else {
            table = oldTable;
        }

    }

    @Override
    public String toString() {
        return "Tablica: " + Arrays.toString(table);
    }
}



public class DynamicTable {

    double[] table = new double[0];

    public void addItem(double number) {
        double[] newItems = new double[table.length + 1];
        int index = 0;
        for (double item: table) {
            newItems[index] = item;
            index++;
        }
        newItems[newItems.length - 1] = number;
        table = newItems;
    }
}


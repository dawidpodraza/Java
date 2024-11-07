public class Main {
    public static void main(String[] args) {
        DynamicTable dynamicTable = new DynamicTable();

        dynamicTable.addItem(1);
        dynamicTable.addItem(2);
        dynamicTable.addItem(3);
        dynamicTable.addItem(4);
        dynamicTable.addItem(4);
        dynamicTable.addItem(4);

        dynamicTable.deleteItem(5);


        System.out.println(dynamicTable.toString());
    }
}

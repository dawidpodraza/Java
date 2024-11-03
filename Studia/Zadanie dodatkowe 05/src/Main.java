

public class Main {
    public static void main(String[] args) {
        UniqueTable uniqueTable = new UniqueTable();

        uniqueTable.addItem(23);
        uniqueTable.addItem(12);
        uniqueTable.addItem(76);
        uniqueTable.addItem(34);

        System.out.println(uniqueTable.toString());
    }
}

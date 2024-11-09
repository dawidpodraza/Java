

public class Main {
    public static void main(String[] args) {
        UniqueTable uniqueTable = new UniqueTable();

        uniqueTable.addItem(4);
        System.out.println(uniqueTable.toString());

        uniqueTable.deleteItem(12);
        System.out.println(uniqueTable.toString());

        // dorobić tworzenie tablicy przez uzytkownika
    }
}

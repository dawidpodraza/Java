public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();

        dataStore.addComputer(new Computer(4321,"Intel"));
        dataStore.addComputer(new Computer(4321,"Intel"));
        dataStore.addComputer(new Computer(4321,"Intel"));
        dataStore.addComputer(new Computer(7654,"AMD"));
        dataStore.addComputer(new Computer(7654,"AMD"));
        dataStore.addComputer(new Computer(9876,"Republic of Gamers"));
        dataStore.addComputer(new Computer(9876,"Republic of Gamers"));
        dataStore.addComputer(new Computer(9876,"Republic of Gamers"));
        dataStore.addComputer(new Computer(9876,"Republic of Gamers"));

        dataStore.computersInfo(dataStore.computers);
        dataStore.checkAvailability(new Computer(4321,"Intel"));

    }
}

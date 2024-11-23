import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        Person p1 = new Person("Dawid", "Nowak", "89112003710");
        Person p2 = new Person("Kamil", "Kowal", "88920032710");
        Person p3 = new Person("Jacek", "Jakis", "98723303710");

        database.add(p1);
        database.add(p2);
        database.add(p3);
        database.add(p1);
        database.add(p1);
        database.add(p3);
        database.add(p3);

        // DODAĆ FUNKCJONALNOŚCI Z ZADANIA O OPERACJACH NA TABLICACH

        database.printInfo();


    }
}

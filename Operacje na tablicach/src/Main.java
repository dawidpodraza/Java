import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        Person p1 = new Person("Dawid", "Nowak", "89112003710");
        Person p2 = new Person("Kamil", "Kowal", "88920032710");
        Person p3 = new Person("Jacek", "Jakis", "98723303710");
        Person p4 = null;

        database.add(p1);
        database.add(p2);
        database.add(p3);
        database.add(p4);
        database.add(p4);
        database.add(p4);
        database.add(p1);
        database.add(p1);
        database.add(p3);
        database.add(p3);


        database.printInfo();
        database.size();
        database.remove(p1);
        database.remove(p3);
//        database.remove(p4);
        database.printInfo();






    }
}

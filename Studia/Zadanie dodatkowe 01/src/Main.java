import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Person[] tabOfPersons = new Person[5];

        tabOfPersons[0] = Person.constructPerson("Dawid", "Kowal");
        tabOfPersons[1] = Person.constructPerson("Kamil", "Nowak");
        tabOfPersons[2] = Person.constructPerson("Maciej", "Kowal");
        tabOfPersons[3] = Person.constructPerson("Natalia", "Zaucha");
        tabOfPersons[4] = Person.constructPerson("Wiktoria", "Kowal");

        for (Person x : tabOfPersons) {
            System.out.println(x);
        }
        System.out.println("-----------------------------------------");
        System.out.println(tabOfPersons[3].getFullName());

        System.out.println("-----------------------------------------");
        familyMembers("Kowal",tabOfPersons);

    }


    public static void familyMembers(String lastName,Person[] persons){
        for (Person person : persons) {
            if (Objects.equals(person.getLastName(), lastName)) {
                System.out.println(person);
            }
        }
    }
}

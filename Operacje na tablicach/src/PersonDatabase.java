import java.util.Arrays;

public class PersonDatabase {
    private Person[] persons = new Person[1];
    private int index = 1;

    public void add(Person p) {

        for (int i = 0; i < persons.length; i++) {
            if (persons[persons.length - 1] != null) {
                index = index + 1;
                Person[] newtab = Arrays.copyOf(persons, index);
                persons = newtab;


            }
            if (persons[i] == null) {
                persons[i] = p;
            }

        }

    }

    public Person[] getPersons() {
        return persons;
    }

    public void printInfo(){
        System.out.println(Arrays.toString(persons));
    }
}

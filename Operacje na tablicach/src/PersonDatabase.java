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

    public void get(int index){
        if(index> persons.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println(getPersons()[index]);
    }

    public void size(){
        int count = 0;
        int countEmpty = 0;
        for (int i = 0; i < persons.length ; i++) {
            if(persons[i]==null){
                countEmpty = countEmpty +1;
            }else{
                count=count+1;
            }
        }
        System.out.println("Liczba elementów w tablicy: "+count);
        System.out.println("Liczba null w tablicy: "+countEmpty);
    }

    public void printInfo(){
        System.out.println(Arrays.toString(persons));
    }
}

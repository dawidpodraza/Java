import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String PESEL;

    public Person(String name, String surname, String PESEL) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(PESEL, person.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, PESEL);
    }

    @Override
    public String toString() {
        return name + " " +
                surname + " " + PESEL;
    }
}

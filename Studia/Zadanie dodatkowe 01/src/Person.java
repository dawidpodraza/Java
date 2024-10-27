import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        if (firstName == null) {
            return lastName;
        } else if (lastName == null) {
            return firstName;
        } else if (firstName == null && lastName == null) {
            return "Brak imienia i nazwiska";
        } else {
            return firstName + " " + lastName;
        }
    }

    public static Person constructPerson(String firstName, String lastName) {
        return new Person(firstName, lastName);
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}

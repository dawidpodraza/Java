import java.time.LocalDate;

public class Person {
    private final String firstName;
    private final String secondName;
    private int yearOfBirth;
    private int age;

    public Person(String firstName, String secondName, int yearOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String printInfo(){
        return firstName+" "+secondName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int printAge(){
        int yearNow = LocalDate.now().getYear();
        return yearNow - yearOfBirth;
    }


}

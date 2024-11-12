import java.io.Externalizable;
import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private double salary;

    public Employee(String firstName, String secondName, double salary) {
        super(firstName, secondName);
        this.salary = salary;
    }

    public Employee() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ " Wypłata: "+getSalary();

    }
}

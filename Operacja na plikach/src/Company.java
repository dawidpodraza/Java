import java.io.Serializable;

public class Company implements Serializable {

    private final Employee[] employees = new Employee[3];
    private int index = 0;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employee) {
        if(index<=3) {
            employees[index] = employee;
            index++;
        }
    }

    public void printInfo(){
        for(Employee e: getEmployees()){
            System.out.println(e.getFirstName()+" "+e.getSecondName()+" "+e.getSalary()+" zł");
        }
    }
}

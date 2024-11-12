import java.io.Serializable;
import java.util.Scanner;

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

    public void addEmployees(){
        Scanner scanner = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.println("Podaj imie pracownika: ");
        e1.setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko pracownika: ");
        e1.setSecondName(scanner.nextLine());
        System.out.println("Podaj wypłate pracownika: ");
        e1.setSalary(scanner.nextInt());
        setEmployees(e1);
    }
}

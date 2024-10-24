public class Hospital {
    private int employeesNumber = 0;

    Person[] employees = new Person[3];

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public void addEmployee(Person person){
        employees[employeesNumber] = person;
        employeesNumber = employeesNumber +1;
    }


    public void getInfo(){
        for (int i = 0; i <employees.length ; i++) {
            System.out.println(employees[i].getInfo());
        }
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        Person employee1 = new Person("Dawid","Podra",7000);
        Person doctor1 = new Doctor("Dawid","Bury",7000,2000);
        Person nurse1 = new Nurse("Justyna","Kowal",7000,12);

        Hospital hospital = new Hospital();

        hospital.addEmployee(employee1);
        hospital.addEmployee(doctor1);
        hospital.addEmployee(nurse1);

        hospital.getInfo();

    }
}

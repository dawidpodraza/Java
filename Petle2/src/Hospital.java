import java.util.Scanner;

public class Hospital {
    private int maxPatientsNumber = 10;
    private Patient[] patient = new Patient[maxPatientsNumber];
    private int regPatients =0;

    public int getMaxPatientsNumber() {
        return maxPatientsNumber;
    }

    public void setMaxPatientsNumber(int maxPatientsNumber) {
        this.maxPatientsNumber = maxPatientsNumber;
    }

    public Patient[] getPatient() {
        return patient;
    }

    public void setPatient(Patient[] patient) {
        this.patient = patient;
    }

    public int getRegPatients() {
        return regPatients;
    }

    public void setRegPatients(int regPatients) {
        this.regPatients = regPatients;
    }

    void addPatient(Patient patient){
        if(regPatients<10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj imie: ");
            String name = scanner.nextLine();
            System.out.println("Podaj nazwisko: ");
            String lastName = scanner.nextLine();
            System.out.println("Podaj pesel: ");
            int pesel = scanner.nextInt();
            this.patient[regPatients] = new Patient(name, lastName, pesel);
            regPatients++;
        }else{
            System.out.println("Nie można dodać wiecej pacjentów");
        }


    }

    void printPatients(){
        for (int i = 0; i < regPatients ; i++) {
            System.out.println("Pacjent nr: "+(i+1));
            System.out.println(patient[i].getFirstName()+" "+patient[i].getLastName());

        }

    }
}

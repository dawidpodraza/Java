import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        Patient patient = new Patient();
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            System.out.println("0- wyjscie\n" +
                    "1- dodaj pacjenta\n" +
                    "2- pokaż liste pacjentów");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> hospital.addPatient(patient);
                case 2 -> hospital.printPatients();
            }
        }while(choice!=0);



    }
}

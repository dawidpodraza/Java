import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {

        userQuestioner();


    }

    private static void userQuestioner() {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        int index = 0;
        String fileName1 = "employee.obj";
        String fileName2 = "employee2.obj";
        String fileName3 = "employee3.obj";

        System.out.println("Dokonaj wyboru:");
        System.out.println("1 - dodaj pracownika");
        System.out.println("2 - wczytaj pracownika z pliku");
        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Zły wybór");
        }
        switch (choice) {
            case 1:
                company.addEmployees();

                    writeToFile(fileName1, company.getEmployees());
                company.addEmployees();
                    writeToFile(fileName2, company.getEmployees());
                company.addEmployees();
                    writeToFile(fileName3, company.getEmployees());

                userQuestioner();
                break;
            case 2:
                readFromFile(fileName1, company.getEmployees());
                userQuestioner();
                break;

        }
    }

    private static void writeToFile(String fileName, Employee[] employee) {
        try (
                var fos= new FileOutputStream(fileName,true);
                var oos= new ObjectOutputStream(fos);

                )
        {
            oos.writeObject(employee);
            oos.close();
            System.out.println("Zapisano 1 obiekt do pliku");

        } catch (IOException e) {
            System.out.println("Wystąpił bład zapisu...");
        }
    }

    private static void readFromFile(String fileName,Employee[] employee){
        try(
                var fis1 = new FileInputStream(fileName);

                var ois1 = new ObjectInputStream(fis1);

        ){
            employee = (Employee[]) ois1.readObject();

        } catch (IOException e) {
            System.out.println("Nie wczytano danych z pliku...");
        } catch (ClassNotFoundException e) {
            System.out.println("Nie znalezniono takiej klasy...");
        }


        assert employee != null; // poczytać co to jest ....
        System.out.println(Arrays.toString(employee));

    }



}

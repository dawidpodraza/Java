import java.io.*;

public class CompanyApp {
    public static void main(String[] args) {

        String fileName1 = "person.obj1";
        String fileName2 = "person.obj2";
        String fileName3 = "person.obj3";
        Employee employee1 = new Employee("Kamil", "Nowak", 12223);
        Employee employee2 = new Employee("Jacek", "Kowal", 8520);
        Employee employee3 = new Employee("Marcin", "Gruby", 9700);

        try (
                var fileStrem1 = new FileOutputStream(fileName1);
                var fileStrem2 = new FileOutputStream(fileName2);
                var fileStrem3 = new FileOutputStream(fileName3);
                var objStream1 = new ObjectOutputStream(fileStrem1);
                var objStream2= new ObjectOutputStream(fileStrem2);
                var objStream3 = new ObjectOutputStream(fileStrem3);
                )
        {
            objStream1.writeObject(employee1);
            System.out.println("Zapisano 1 obiekt do pliku");
            objStream2.writeObject(employee2);
            System.out.println("Zapisano 2 obiekt do pliku");
            objStream3.writeObject(employee3);
            System.out.println("Zapisano 3 obiekt do pliku");

        } catch (IOException e) {
            System.out.println("Wystąpił bład zapisu...");
        }



    }
}

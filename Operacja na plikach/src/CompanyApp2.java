import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CompanyApp2 {
    public static void main(String[] args) {
        String fileName1 = "person.obj1";
        String fileName2 = "person.obj2";
        String fileName3 = "person.obj3";

        Employee employee1 = null;
        Employee employee2 = null;
        Employee employee3 = null;

        try(
                var fis1 = new FileInputStream(fileName1);
                var fis2 = new FileInputStream(fileName2);
                var fis3 = new FileInputStream(fileName3);
                var ois1 = new ObjectInputStream(fis1);
                var ois2 = new ObjectInputStream(fis2);
                var ois3 = new ObjectInputStream(fis3);
                ){
                employee1 = (Employee) ois1.readObject();
                employee2 = (Employee) ois2.readObject();
                employee3 = (Employee) ois3.readObject();


        } catch (IOException e) {
            System.out.println("Nie wczytano danych z pliku...");
        } catch (ClassNotFoundException e) {
            System.out.println("Nie znalezniono takiej klasy...");
        }



//        System.out.println(employee1.toString());
//        System.out.println(employee2.toString());
//        System.out.println(employee3.toString());
    }


}

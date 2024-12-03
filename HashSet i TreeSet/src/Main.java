import java.io.*;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        String fileName = "namespl.txt";
        File file = new File(fileName);

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String result= null;

        TreeSet<String> listaImion = new TreeSet<>();
        while((result = reader.readLine()) != null){

            listaImion.add(result);
        }
        //dodać funkcjonalnoś która odwróci faktycznie te TreeSet , wykorzystać
        // comparator do tego i douczyć się o tym comparatorze !!!
        
        System.out.println(listaImion.reversed());

    }
}

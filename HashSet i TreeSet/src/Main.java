import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        String fileName = "namespl.txt";
        File file = new File(fileName);

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String result= null;


        //Przemyśleć jak działa ten Comparator żeby to zrozumieć powtórzyć tą lekcję !!!

        TreeSet<String> listaImion = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareTo(s2);
            }
        });

        while((result = reader.readLine()) != null){

            listaImion.add(result);

        }
        System.out.println(listaImion);
        System.out.println(listaImion.size());
        System.out.println(listaImion.first());
        System.out.println(listaImion.last());
    }
}

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        String file = "test.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String first = bufferedReader.readLine();
            String second = bufferedReader.readLine();
            String third = bufferedReader.readLine();
            String fourth = bufferedReader.readLine();
            String fifth = bufferedReader.readLine();

            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);
            int thirdNum = Integer.parseInt(third);

            BigInteger fourNum = new BigInteger(fourth);
            BigInteger fifthNum = new BigInteger(fifth);

            System.out.println(firstNum+secondNum+thirdNum);
            System.out.println(fourNum.add(fifthNum));
        }catch(IOException e){
            System.out.println("Wystąpił bład");
        }


    }
}

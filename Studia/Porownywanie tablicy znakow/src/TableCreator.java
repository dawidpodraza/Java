import java.util.Arrays;

public class TableCreator implements TableMachine {


    public int compareTo(String left, String right) {
        char[] leftString = left.toCharArray();
        char[] rightString = right.toCharArray();

        int result;


        if (leftString[0] < rightString[0]) {
            result = -1;
        } else if (leftString[0] == rightString[0]) {
            result = 0;
        } else {
            result = 1;
        }


        return result;
    }
}

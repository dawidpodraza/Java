import java.util.Arrays;
import java.util.Scanner;

public class Words {
    private String[] words = new String[1];
    private int index = 0;

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }



    public void ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String answer = scanner.next();
        words[index] = answer;
        words = Arrays.copyOf(words, words.length + 1);
        index++;
    }

//    public void count() {
//
//        int countA = 0;
//        int countB = 0;
//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < words.length; j++) {
//                if (words[i].equals(words[j + 1])) {
//                    String a = words[i];
//                    countA++;
//                }
//            }
//        }
//
//    }

    @Override
    public String toString() {
        return "Words{" +
                "words=" + Arrays.toString(words) +
                '}';
    }
}

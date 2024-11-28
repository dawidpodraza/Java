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
        System.out.println("Podaj słowo (lub wpisz q aby zakończyć): ");
        String answer = scanner.next();
        if(answer.equals("q")){
            System.exit(0);
        }
        words[index] = answer;
        words = Arrays.copyOf(words, words.length + 1);
        index++;
    }

    public void count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakie słowo chcesz sprawdzić? ");
        String wordToFind = scanner.next();
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (wordToFind.equals(words[i])) {
                counter++;
            }
        }
        System.out.println("Liczba słow " + wordToFind + " w tablicy: " + counter);

    }

    @Override
    public String toString() {
        return "Words{" +
                "words=" + Arrays.toString(words) +
                '}';
    }
}

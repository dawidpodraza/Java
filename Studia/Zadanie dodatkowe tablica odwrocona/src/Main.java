public class Main {
    public static void main(String[] args) {
        String[] tab = {"a","b","c","d","e","f"};
        String[] revTab = new String[tab.length];
        int index =tab.length-1;

        for(String word:tab){
            revTab[index]= word;
            index--;
        }

        for(String word: revTab){
            System.out.println(word);
        }

    }
    
}

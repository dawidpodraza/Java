public class Main {
    public static void main(String[] args) {

        int[] tab = {2,3,4,5,6,7,8,9,20};
        int srednia = 0;

        for(int number:tab){
            srednia = srednia +number;
        }
        System.out.println("Średnia: ");
        System.out.println(srednia/tab.length);


    }
}

public class Main {
    public static void main(String[] args) {
        int x=5;
        int y= ++x;
        int z =x++;

        System.out.println(y); //6
        System.out.println(z); //6
    }
}

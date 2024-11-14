public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    static int factorial(int n) {
        int result = 1;
        if(n>1){
            
            result = n * (factorial(n-1));
        }return result;
    }
}

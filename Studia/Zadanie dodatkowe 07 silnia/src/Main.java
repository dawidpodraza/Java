public class Main {
    public static void main(String[] args) {

        System.out.println(factorialRecursive(6));
    }
    public static int factorial(int n){
        int result=1;
        for (int i = 1; i <=n ; i++) {
            result=result*i;
        }
        return result;
    }
    public static int factorialRecursive(int n){
            if(n<=1) {
                return 1;
            }else {
                return n * factorialRecursive(n - 1);
            }
        }

    }


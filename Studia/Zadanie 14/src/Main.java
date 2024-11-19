public class Main {
    public static void main(String[] args) {

        System.out.println(nwd(6,3));

    }
    public static int nwd(int a,int b){
        while(a!=b){
            if(a<b){
                b=b-a;
            }else{
                a=a-b;
            }

        }
        return a;
    }
}

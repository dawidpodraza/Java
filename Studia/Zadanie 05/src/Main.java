public class Main {
    public static void main(String[] args) {
        int age= 10;
        String animal = "pies";

        if(animal.equals("pies")){
            if(age>6){
                System.out.println("stary pies");
            }else{
                System.out.println("młody pies");
            }

        }else if(animal.equals("kot")) {
            if (age > 8) {
                System.out.println("stary kot");
            } else {
                System.out.println("młody kot");
            }
        }
    }
}

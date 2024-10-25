public class Counter {
    private double result;

    private void printResult (){
        System.out.println(result);
    }

    public void count (double x, double y,String z){

        switch (z){
            case "+" -> result = x+y;
            case "-" -> result = x-y;
            case "*" -> result = x*y;
            case "/" -> result =x/y;
        }

        printResult();

    }

}

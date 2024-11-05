public class Calculate {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public static void equation(double x, char z , double y)throws UnknownOperatorException{
        if(z!= '+' && z!='-' && z!= '*' && z!='/'){
            throw new UnknownOperatorException("Podano błędne działanie do wykonania");

        } else if (z == '+') {
            System.out.println(x+y);
        }else if (z == '-') {
            System.out.println(x-y);
        }else if (z == '*') {
            System.out.println(x*y);
        }else if (z == '/'){
            if(y==0){
                throw new ArithmeticException();
            }else {
                System.out.println(x / y);
            }
        }

    }
}

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger bigNumb1 = new BigInteger("2323213213213213213213213");
        BigInteger bigNumb2 = new BigInteger("9789879879879879879879879879879");

        BigInteger result = bigNumb1.add(bigNumb2);

        System.out.println(result);

        BigDecimal num1 = BigDecimal.valueOf(123.213213);
        BigDecimal num2 = BigDecimal.valueOf(12.34554764765756);

        BigDecimal result2 = num1.add(num2);
        System.out.println(result2);
    }
}

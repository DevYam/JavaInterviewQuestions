import java.math.BigInteger;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 10/09/2020  -  09:16
 * @project JavaInterviewQuestions
 */

/**
 * This program is using BigInteger Java class ,
 * it can calculate factorial of any big number
 * that primitive data types cannot hold.
 */
public class HundredFactorial {
    static BigInteger fact(int N){
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(fact(100));
    }
}

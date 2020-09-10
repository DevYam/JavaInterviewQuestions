import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 10/09/2020  -  09:33
 * @project JavaInterviewQuestions
 */
public class GeneralFactorial {
    public static void main(String[] args) {
        BigInteger fact = new BigInteger("1");
        System.out.println("Enter a number to find factorial :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 2; i <=num ; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }

}

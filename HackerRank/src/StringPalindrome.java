import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 08/09/2020  -  15:39
 * @project JavaInterviewQuestions
 */
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            rev.append(str.charAt(i));
        }
        if (rev.toString().equals(str)){
            System.out.println("Yes");
        }

    }
}

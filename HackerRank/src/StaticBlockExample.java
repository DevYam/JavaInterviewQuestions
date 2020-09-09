import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 09/09/2020  -  15:40
 * @project JavaInterviewQuestions
 */
public class StaticBlockExample {
    static int B;
    static int H;
    static boolean flag = false;
static {
    Scanner sc = new Scanner(System.in);
     B = sc.nextInt();
     H = sc.nextInt();
    if (B<=0 || H<=0){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }else
        flag = true;
}

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}

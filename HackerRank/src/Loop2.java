import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 09/09/2020  -  14:50
 * @project JavaInterviewQuestions
 */
public class Loop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        int record = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
                record = record+a;
            for (int j = 0; j < n; j++) {
                int bias = (int)(Math.pow(2,j))*b;
                record = record+bias;
            System.out.print(record+" ");
            }
        }
        in.close();
    }

}

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 08/09/2020  -  11:15
 * @project JavaInterviewQuestions
 */
public class SmallestAndLargestSubstring {
// This finds Lexicographically smallest and largest substring of a given length

    /**
     * This was an easy implementation but HackerRank does not allow
     * import of java.util.ArrayList :(
     */

//    public static void main(String[] args) {
//        String smallest= "";
//        String largest = "";
//        String given = "";
//        int length ;
//        ArrayList<String> arr = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        given = sc.nextLine();
//        length = sc.nextInt();
//        for (int i = 0; i<given.length(); i++){
//            if (i<=given.length()-3){
//                String possible =  given.substring(i,length+i);
//                arr.add(possible);
//            }
//        }
//            arr.sort(String::compareToIgnoreCase);
//        System.out.println(arr.get(0));
//        System.out.println(arr.get(arr.size()-1));
//    }

    /**
     * Question = Given a string, S, and an integer, K, complete the function so that it finds
     * the lexicographically smallest and largest substrings of length K.
     */

    public static void main(String[] args) {
        String smallest= "";
        String largest = "";
        String given = "";
        int length ;
        Scanner sc = new Scanner(System.in);
        given = sc.nextLine();
        length = sc.nextInt();
        String[] arr = new String[given.length()-(length-1)];
        for (int i = 0; i<given.length(); i++){
            if (i<=given.length()-length){
                String possible =  given.substring(i,length+i);
                arr[i] = possible;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("smallest = "+arr[0]+" and Largest = "+arr[arr.length-1]);
    }
}

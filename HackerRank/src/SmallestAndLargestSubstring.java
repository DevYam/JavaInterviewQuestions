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

    // TODO Need rework, as we are checking only the first letter

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

        int key = 0;
        int index = 0;
        int key2 = 0;
        int index2 = 0;
        int flag = 0;
        for (int i = 0; i <arr.length ; i++) {
            String curr = arr[i];
            char firstChar = curr.charAt(0);
            if (key == (int)firstChar){
                System.out.println("same");
            }
            if (key<(int)firstChar){
                key = (int)firstChar;
                index = i;
            }
        }
        System.out.println("Largest "+arr[index]);
        key2 = (int)arr[index].charAt(0);

        for (int i = 0; i <arr.length ; i++) {
            String curr = arr[i];
            char firstChar = curr.charAt(0);
            if ((int)firstChar < key2){
                key2 = (int)firstChar;
                index2 = i;
            }
        }

        System.out.println("Smallest "+arr[index2]);

    }
}

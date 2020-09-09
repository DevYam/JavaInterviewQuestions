import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 09/09/2020  -  10:06
 * @project JavaInterviewQuestions
 */

/**
 * Question : -
 * You are given n lines. In each line there are zero or more integers.
 * You need to answer a few queries where you need to tell the number
 * located in y position of x line.
 *
 *
 * Sample Input
 * 5
 * 5 41 77 74 22 44
 * 1 12
 * 4 37 34 36 52
 * 0
 * 3 20 22 33
 * 5
 * 1 3
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 *
 * Sample Output
 * 74
 * 52
 * 37
 * ERROR!
 * ERROR!
 */
public class ArrayListAndQueries  {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();
        ArrayList<List<Integer>> userInput = new ArrayList<>();
        for (int i = 0; i < numberOfLines; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int columnEntryCount = sc.nextInt();
            if (columnEntryCount>0){
                for (int j=0; j<columnEntryCount; j++){
                    int curr = sc.nextInt();
                    arr.add(curr);
                }
            }
            userInput.add(arr);
        }
        int numberOfQueries = sc.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {
                int rowNumber = sc.nextInt();
                int columnNumber = sc.nextInt();
                    List<Integer> rowArr = userInput.get(rowNumber-1);
                    if(columnNumber <= rowArr.size()){
                        int res = rowArr.get(columnNumber-1);
                        System.out.println(res);
                    }else{
                        System.out.println("ERROR!");
                    }
        }
    }
}

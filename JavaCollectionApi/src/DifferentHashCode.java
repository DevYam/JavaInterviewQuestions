import java.util.HashSet;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 04/09/2020  -  11:50
 * @project JavaInterviewQuestions
 */

class Country{
    private String name;
    Country(String name){
        this.name = name;
    }
   public String toString(){
        return name;
   }
}
public class DifferentHashCode {
    public static void main(String[] args) {
        HashSet<Object> mySet = new HashSet<>();

        String s1 = "India";
        String s2 = "India";

        Country s3 = new Country("USA");
        Country s4 = new Country("USA");

        mySet.add(s1);
        mySet.add(s2);
        mySet.add(s3);
        mySet.add(s4);

        System.out.println(mySet);

        // Output = [USA, USA, India]

        /**
         * As String class overrides hashcode and equals method,
         * it won’t allow the same string twice in HashSet, but we
         * did not implement hashcode and equals method for Country
         * class, so each object will have different hashcode hence
         * can be inserted in HashSet.
         */

    }
}

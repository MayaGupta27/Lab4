/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

public class ReclamationProject {
    public static void main(final String[] args) {
       String test = testsEquality("calculus", "calc");
       System.out.println(test);
    }
    static String testsEquality(String initial, String second) {
        //Makes sure string a is longer
        if (initial.length() > second.length()) {
            String temp = initial; //set temp string equal to a
            initial = second;
            second = temp;
        }
        String similar = "";
        /*
         * For loop with i
         */
        //Iterates through string a
        for (int i = 0; i < initial.length(); i++) {
          //Iterates backwards from i through the beginning of the string
            for (int j = initial.length() - i; j > 0; j--) {
                for (int k = 0; k < second.length() - j; k++) { //Iterates through string b
                   if (initial.regionMatches(true, i, second, k, j) && j > similar.length()) {
                       similar = initial.substring(i, i + j);
                   }
                }
            }
        }
            return similar;
     }
}

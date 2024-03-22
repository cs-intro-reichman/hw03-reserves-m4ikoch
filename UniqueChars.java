/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String res = "" ;
        for (int i = 0; i < s.length(); i++) {
            if (res.indexOf(s.charAt(i)) == -1 || s.charAt(i) == ' ' ) {
                res += s.charAt(i);
            }
        }
        return res;
    }
}
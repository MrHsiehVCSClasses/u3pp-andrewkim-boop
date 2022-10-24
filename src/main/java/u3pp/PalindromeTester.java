package u3pp;
public class PalindromeTester {

    /**
     * Tests whether a string is a palindrome. Case insensitive. 
     * @param s  the string to test
     * @return true if the string is a palindrome
     */
    
    public static boolean isPalindrome(String s)
    {       
        String reverse = "";
        boolean test = false;
        String lowerS = s.toLowerCase();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            String lower = Character.toString(c);
            reverse += lower.toLowerCase();
        }
        if (lowerS.equals(reverse)) {
            test = true;
        }
        return test;
    } 
}
package u3pp;
public class Main 
{
    public static void main(String[] args) {
        // Use this space to test your code, or actually run your project
        // for some reason the maven tests did not work and so I had to make my own tests, but luckily the code does work
        PalindromeTester myPalindrome = new PalindromeTester();
        System.out.println(myPalindrome.isPalindrome("n"));
        System.out.println(myPalindrome.isPalindrome("neveroddoreven"));
        System.out.println(myPalindrome.isPalindrome("nEVERoddOREVen"));
        System.out.println(myPalindrome.isPalindrome("()#!$*(%*("));
        System.out.println(myPalindrome.isPalindrome("%%%$$%%%"));
        System.out.println(myPalindrome.isPalindrome("narihsdiofasidfjaio"));
    }

}

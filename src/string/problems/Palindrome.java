package string.problems;

public class Palindrome {
    public static boolean main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        public static boolean isPalindrome;
        System.out.println(isPalindrome("MADAM"));
        (String m){
            if (m.length() <= 1) {
                return true;
            }
            if (m.charAt(0) == m.charAt(m.length() - 1)) {
                return isPalindrome(m.substring(1, m.length() - 1));
            } else {
                return false;
            }
        }

    }

    public static boolean isPalindrome(String MADAM){
        return isPalindrome(MADAM);
    }
}


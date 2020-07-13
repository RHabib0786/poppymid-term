package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Assert.assertEquals(true, Anagram.isAnagram("Slient","Listen"));
        String testString = "Thank you";
        Assert.assertEquals("Hello", DetermineLargestWord.findTheLargestWord(testString));
        Assert.assertEquals(true, Palindrome.isPalindrome("MADAM"));
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

    }
}

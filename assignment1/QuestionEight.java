package assignment1;

/**
 * QuestionEight
 */

public class QuestionEight {
    public static void main(String args[])
    {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "dog";
        String str3 = "fog";

        System.out.println("Original string: " + str1);
        System.out.println("New String: " + str1.replace(str2,str3));

    }
}

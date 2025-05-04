package assignment1;

public class QuestionFive
{
    public static void main(String args[])
    {
            String str1 = "example.com";
            StringBuffer strbfr1 = new StringBuffer("example.com");

            String str2 = "Example.com";
            StringBuffer strbfr2 = new StringBuffer("example.com");

            System.out.println("Comparing " + str1 + " and " + strbfr1 + ": " + str1.equals(strbfr1.toString()));
            System.out.println("Comparing " + str2 + " and " + strbfr2 + ": " + str2.equals(strbfr2.toString()));




    }
}

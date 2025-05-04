package assignment1;



public class QuestionFour {


    public static void main(String args[]) {

        String str1 = "example.com";
        String str2 = "example.com";
        String str3 = "Example.com";

        System.out.println("Comparing "+ str1 + " and " + str2 + ":" + str1.contentEquals(str2));
        System.out.println("Comparing "+ str1 + " and " + str3 + ":" + str1.contentEquals(str3));

    }

    }
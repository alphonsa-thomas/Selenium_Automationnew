package assignment1;

public class QuestionNine {

    public static void main(String args[])
    {
        String str = "w3resource";

        System.out.println("The given string is: " + str);

        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            char currentChar = str.charAt(i);


            if (result.indexOf(currentChar)== -1)
            {
                result = result + currentChar;
            }

        }

        System.out.println("After removing duplicates characters the new string is: " + result);
    }

}

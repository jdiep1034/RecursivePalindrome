
/**
 * This program contains the method to determine whether a string is a palindrome.
 *
 * @author Justin Diep
 * @version 4-19-18
 */
public class RecursivePalindrome
{
    //This method helps deal with upper case, lower case, punctuation and spaces.
    public static String Helper(String a)
    {
        a = a.toLowerCase();
        a = a.replaceAll("\\s","");
        return a;
    }
    
    //This method reverses a string
    public static String Reverse(String a)
    {
        if(a.length() == 0)
        {
            return "";
        }
        String first = a.substring(0,1);
        String reverse = Reverse(a.substring(1));
        
        String finish = reverse + first;
        return finish;
    }
    
    //This method tests if a string is a palindrome
    public static String Palindrome(String a)
    {
        a = Helper(a);
        String b = Reverse(a);
        if( a.equals(b) )
        {
            return "yes";
        }
        else
        {
            return "no";
        }
    }
}

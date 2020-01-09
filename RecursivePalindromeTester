
/**
 * The purpose of this program is to determine whether a given string is a palindrome.
 *
 * @author Justin Diep
 * @version 4-19-18
 */
import java.util.Scanner;
public class RecursivePalindromeTester
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Time to test if your word is a palindrome!");
        System.out.print("Please type the word you wish to test(Type 'stop' to quit): ");
        String word = in.nextLine();
        System.out.println();
        
        while(word.equals("stop") == false)
        {
            String Test = RecursivePalindrome.Palindrome(word);
            if(Test.equals("yes"))
            {
                System.out.println("Yes! "+ word + " is a palindrome");
                System.out.print("Try another (Type 'stop' to quit): ");
                word = in.nextLine();
                System.out.println();
            }
            else
            {
                System.out.println("Sorry, " + word + " is not a palindrome.");
                System.out.print("Try another (Type 'stop' to quit): ");
                word = in.nextLine();
                System.out.println();
            }
        }
        System.out.println("Thank you for testing, have a nice day!");
    }
}

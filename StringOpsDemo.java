// Tony Trinh
// September 15, 2025
// Assignment 5

package java2.fall2025;

/**
   This program demonstrates a solution to the
   Miscellaneous String Operations programming 
   challenge.
*/
/** Instructions - Modify this program to prompt the user to enter the strings to be entered
 * by the user instead of using the hard coded string below (str) and the hard coded array (array).
 * Identify every where that you add/modified/deleted code below with a comment indicating such.
 */


public class StringOpsDemo
{
   public static void main(String[] args)
   {
      String str = "the dog jumped over the fence";
      char[] array = {'H', 'o', 'w', ' ', 'n', 'o', 'w',
                      ' ', 'b', 'r', 'o', 'w', 'n', ' ',
                      'c', 'o', 'w' };
      
      // Display the number of words in the string.
      System.out.println("Number of words in \"" + str + "\" is " +
                         StringOps.wordCount(str));
                         
      // Display the most frequently occurring character.
      System.out.println("Most frequently occuring character: " +
                         StringOps.mostFrequent(str));
                         
      // Replace "the" with "that".
      System.out.println(StringOps.replaceSubString(str, "the", "that"));
      
      // Convert an array to a string and display it.
      String str2 = StringOps.arrayToString(array);
      System.out.println(str2);
   }
}

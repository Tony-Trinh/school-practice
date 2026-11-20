// Tony Trinh
// September 15, 2025
// Assignment 5

package java2.fall2025;

/**
   The StringOperations class provides several methods that 
   work with strings for the Miscellaneous String Operations
   programming challenge.
*/
/** Instructions - Modify the class below to add the code for each of the methods.
 */

public class StringOps {
   /**
      The wordCount method counts the number of words in
      a string.
      @param str The string to count.
      @return The number of words.
   */
   
   // Count words in a string
   public static int wordCount(String str) {
      int count = 1;
      for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == ' ') count++;
      }
      return count;
    }

   /**
      The arrayToString method converts a char array
      to a String.
      @param array The array to be converted.
      @return A reference to the String.
   */
   
   // Convert char array to String
   public static String arrayToString(char[] array)
   {
      return new String(array);
   }

   /**
      The mostFrequent method determines which character
      appears with the most frequently in a string.
      @param str The string to check.
      @return The character that appears most frequently
              in the String.
   */
   
   // Find most frequent character
   public static char mostFrequent(String str)
   {
    // remove spaces so they are not counted
    str = str.replace(" ", "");

    char result = ' ';
    int maxCount = 0;

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);

        // count how many times c appears
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == c) {
                count++;
            }
        }

        // update result if this char appears more
        if (count > maxCount) {
            maxCount = count;
            result = c;
        }
    }

    return result;
   }


   /**
      The replaceSubstring method accepts three Strings as
      arguments. It returns a String that is a copy of 
      string1, where all occurrences of string2 have been
      replaced by string3.
      @param string1 The first string.
      @param string2 The second string.
      @param string3 The third string.
      @return The resultant string.
   */

   // Replace all occurrences of string2 with string3
   public static String replaceSubString(String string1,
                          String string2, String string3)
   {
      return string1.replace(string2, string3);
   }
}
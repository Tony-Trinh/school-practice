// Tony Trinh
// 09/30/2025
// Assignment 7
// Cipher1 shifts letters by 3 for encryption and decryption.

package java2.fall2025;   // folder name for this project

public class Cipher1 implements Crypto   // Cipher1 follows the Crypto rules
{
   @Override
   public String encrypt(String str)   // change normal text into secret code
   {
      String result = "";              // start with empty result
      str = str.toUpperCase();         // make all letters uppercase

      for (int i = 0; i < str.length(); i++)   // look at each letter
      {
         char letter = str.charAt(i);          // take one letter

         if (letter >= 'A' && letter <= 'Z')   // only shift letters A–Z
         {
            // move forward 3 letters in the alphabet
            letter = (char)(letter + 3);

            if (letter > 'Z')  // if past Z, go back to the start
            {
               letter = (char)(letter - 26);
            }
         }

         result = result + letter;   // add the new letter to the result
      }

      return result;   // give back the coded word
   }

   @Override
   public String decrypt(String str)   // change code back to normal text
   {
      String result = "";              // start with empty result
      str = str.toUpperCase();         // make all letters uppercase

      for (int i = 0; i < str.length(); i++)   // look at each letter
      {
         char letter = str.charAt(i);          // take one letter

         if (letter >= 'A' && letter <= 'Z')   // only shift letters A–Z
         {
            // move backward 3 letters in the alphabet
            letter = (char)(letter - 3);

            if (letter < 'A')  // if before A, wrap around to the end
            {
               letter = (char)(letter + 26);
            }
         }

         result = result + letter;   // add the new letter to the result
      }

      return result;   // give back the normal word
   }
}

// Tony Trinh
// 09/30/2025
// Assignment 7
// Cipher2 uses reverse alphabet for encryption and decryption.

package java2.fall2025;   // folder name for this project

public class Cipher2 implements Crypto   // Cipher2 class uses the Crypto rules
{
   @Override
   public String encrypt(String str)   // method to change normal text into code
   {
      String result = "";              // start with an empty word
      str = str.toUpperCase();         // make all letters uppercase

      for (int i = 0; i < str.length(); i++)   // go through each letter
      {
         char letter = str.charAt(i);          // take one letter

         if (letter >= 'A' && letter <= 'Z')   // if it is A–Z
         {
            // flip the alphabet: A becomes Z, B becomes Y, etc.
            letter = (char)('Z' - (letter - 'A'));
         }

         result = result + letter;             // add the letter to the new word
      }

      return result;                           // give back the coded word
   }

   @Override
   public String decrypt(String str)   // method to change code back to normal
   {
      // flipping twice gives the original, so use same code
      return encrypt(str);
   }
}

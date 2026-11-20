// Tony Trinh
// 09/30/2025
// Assignment 7
// Tester program for Cipher1 and Cipher2.

package java2.fall2025;
import java.util.Scanner;

/**
   This program tests the Cipher1 and Cipher2 classes,
   as well as the Crypto interface.
*/
public class CryptoTester
{
   public static void main(String[] args)
   {
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Create the cipher objects
      Cipher1 cipher1 = new Cipher1();
      Cipher2 cipher2 = new Cipher2();

      // Get a message from the user.
      System.out.print("Enter your message: ");
      String message = keyboard.nextLine().toUpperCase();

      // Display the message as encrypted and decrypted with Cipher1
      displayMessage(message, cipher1);

      // Display the message as encrypted and decrypted with Cipher2
      displayMessage(message, cipher2);
   }

   /**
      The displayMessage method uses a Crypto object to
      encrypt and decrypt a message.
      @param msg The message to encrypt.
      @param crypto The Crypto object to use.
   */
   public static void displayMessage(String msg, Crypto crypto)
   {
      System.out.println("Encrypted: " + crypto.encrypt(msg));
      System.out.println("Decrypted: " + crypto.decrypt(msg));
   }
}


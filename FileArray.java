// Tony Trinh
// October 7, 2025
// Assignment 10
// This class has two static methods to write and read an int array to/from a file.

package java2.fall2025;
import java.io.*; // For file input and output

public class FileArray {

    // Writes an int array to a file
    public static void writeArray(String fileName, int[] array) throws IOException {
        // Create a DataOutputStream to write data to the file
        DataOutputStream output = new DataOutputStream(new FileOutputStream(fileName));

        // Write each number in the array to the file
        for (int value : array) {
            output.writeInt(value);
        }

        // Close the file when done
        output.close();
    }

    // Reads integers from a file and stores them in an array
    public static void readArray(String fileName, int[] array) throws IOException {
        // Create a DataInputStream to read data from the file
        DataInputStream input = new DataInputStream(new FileInputStream(fileName));

        // Read numbers from the file and store them into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = input.readInt();
        }

        // Close the file when done
        input.close();
    }
}

package Accenture;

public class BinaryString {

    public static int OperationsBinaryString(String str) {
        // Check if input string is null or empty
        if (str == null || str.length() == 0) {
            return -1;
        }

        // Initialize the result with the first character (which is a binary digit)
        int result = str.charAt(0) - '0'; // Convert '1' or '0' char to integer

        // Traverse the string from the second character onwards
        for (int i = 1; i < str.length(); i += 2) {
            char operation = str.charAt(i); // Current operation (A, B, C)
            int nextDigit = str.charAt(i + 1) - '0'; // Next binary digit (0 or 1)

            // Perform the operation based on the character
            switch (operation) {
                case 'A':
                    result = result & nextDigit; // AND operation
                    break;
                case 'B':
                    result = result | nextDigit; // OR operation
                    break;
                case 'C':
                    result = result ^ nextDigit; // XOR operation
                    break;
                default:
                    // Invalid operation character
                    return -1;
            }
        }

        // Return the final result after all operations
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "1C0C1C1A0B1";
        String str2 = "0C1A1B1C1C1B0A0";

        System.out.println(OperationsBinaryString(str1)); // Output: 1
        System.out.println(OperationsBinaryString(str2)); // Output: 0
    }
}

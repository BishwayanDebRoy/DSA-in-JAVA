package Accenture;

public class PasswordChecker {

    public static int CheckPassword(char str[], int n) {
        // Check if the password length is at least 4 characters
        if (n < 4) {
            return 0;
        }

        // Check if the first character is a number
        if (Character.isDigit(str[0])) {
            return 0;
        }

        // Initialize flags to check for required conditions
        boolean hasDigit = false;
        boolean hasUpperCase = false;

        // Traverse through the string
        for (int i = 0; i < n; i++) {
            char ch = str[i];

            // Check if character is a digit
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            // Check if character is an uppercase letter
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }

            // Check if the character is a space or slash (/)
            if (ch == ' ' || ch == '/') {
                return 0; // Invalid character found
            }
        }

        // Return 1 if all conditions are satisfied, else 0
        if (hasDigit && hasUpperCase) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "aA1_67";
        String input2 = "a987 abC012";

        System.out.println(CheckPassword(input1.toCharArray(), input1.length())); // Output: 1
        System.out.println(CheckPassword(input2.toCharArray(), input2.length())); // Output: 0
    }
}

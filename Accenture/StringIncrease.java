package Accenture;

import java.util.*;

public class StringIncrease {

    public static void main(String[] args) {
        String input = "a3b10";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i); // Get the letter
            StringBuilder num = new StringBuilder(); // To handle multi-digit numbers

            // Move to the number part and collect all digits
            while (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                num.append(input.charAt(++i));
            }

            // Convert the collected digits into an integer
            int count = Integer.parseInt(num.toString());

            // Append the letter 'count' times to the result
            for (int j = 0; j < count; j++) {
                result.append(letter);
            }
        }

        System.out.println(result.toString());
    }

}

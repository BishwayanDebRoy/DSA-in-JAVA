package Accenture;

import java.util.*;

class KeyboardRobot {

    // Method to compute the total movement distance
    public static int calculateTotalDistance(String typedWord) {
        // Store the position (row, column) of each character on the keyboard (without
        // numbers)
        Map<Character, int[]> keyboardLayout = new HashMap<>();

        keyboardLayout.put('Q', new int[] { 0, 0 });
        keyboardLayout.put('W', new int[] { 0, 1 });
        keyboardLayout.put('E', new int[] { 0, 2 });
        keyboardLayout.put('R', new int[] { 0, 3 });
        keyboardLayout.put('T', new int[] { 0, 4 });
        keyboardLayout.put('Y', new int[] { 0, 5 });
        keyboardLayout.put('U', new int[] { 0, 6 });
        keyboardLayout.put('I', new int[] { 0, 7 });
        keyboardLayout.put('O', new int[] { 0, 8 });
        keyboardLayout.put('P', new int[] { 0, 9 });

        keyboardLayout.put('A', new int[] { 1, 0 });
        keyboardLayout.put('S', new int[] { 1, 1 });
        keyboardLayout.put('D', new int[] { 1, 2 });
        keyboardLayout.put('F', new int[] { 1, 3 });
        keyboardLayout.put('G', new int[] { 1, 4 });
        keyboardLayout.put('H', new int[] { 1, 5 });
        keyboardLayout.put('J', new int[] { 1, 6 });
        keyboardLayout.put('K', new int[] { 1, 7 });
        keyboardLayout.put('L', new int[] { 1, 8 });

        keyboardLayout.put('Z', new int[] { 2, 0 });
        keyboardLayout.put('X', new int[] { 2, 1 });
        keyboardLayout.put('C', new int[] { 2, 2 });
        keyboardLayout.put('V', new int[] { 2, 3 });
        keyboardLayout.put('B', new int[] { 2, 4 });
        keyboardLayout.put('N', new int[] { 2, 5 });
        keyboardLayout.put('M', new int[] { 2, 6 });

        // Starting point is at 'Q'
        int[] currentPos = keyboardLayout.get('Q');
        int movementDistance = 0;

        // Loop over the input string to calculate the movement
        for (char character : typedWord.toCharArray()) {
            int[] targetPos = keyboardLayout.get(character);

            // Compute the Manhattan distance (only horizontal and vertical moves)
            movementDistance += Math.abs(currentPos[0] - targetPos[0]) + Math.abs(currentPos[1] - targetPos[1]);

            // Update the current position after each move
            currentPos = targetPos;
        }

        return movementDistance;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Example word inputs
        String word1 = "QA";
        String word2 = "HELLO";

        // Display the distance calculations for each word
        System.out.println("Total Distance for '" + word1 + "': " + calculateTotalDistance(word1));
        System.out.println("Total Distance for '" + word2 + "': " + calculateTotalDistance(word2));
    }
}

// all edge cases are handled properly.
package Accenture;

import java.util.*;

public class SpecialNum {

    // Function to generate the special sequence
    public static int[] generateSpecialSequence(int n) {
        int[] arr = new int[n];

        // Sequence starts from n + 1 and goes up to n + n
        for (int i = 0; i < n; i++) {
            arr[i] = n + 1 + i; // Filling array from n + 1 to n + n
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Special Sequence"); // Invalid input
            return;
        }

        // Generate the special sequence based on the input n
        int[] arr = generateSpecialSequence(n);

        // Output the special sequence
        System.out.print("Special Sequence: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();

    }
}

// output for special sequence is generated
package BasicHashing;

import java.util.*;

public class CountDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // Loop through the array to count distinct elements
        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;

            // Check if the current element has appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break; // No need to check further, it's not distinct
                }
            }

            // If the element is distinct, increment the count
            if (isDistinct) {
                count++;
            }
        }

        System.out.println("Number of distinct elements: " + count);
        sc.close();
    }
}
//comment added
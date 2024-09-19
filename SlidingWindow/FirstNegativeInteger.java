package SlidingWindow;

import java.util.*;

public class FirstNegativeInteger {

    public static void firstNegative(int[] arr, int k) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        // Sliding window pointers
        int i = 0, j = 0;

        while (j < arr.length) {
            // If current element is negative, add to the queue
            if (arr[j] < 0) {
                queue.add(arr[j]);
            }

            // Expand the window
            if ((j - i + 1) < k) {
                j++;
            }
            // When window size reaches k
            else if ((j - i + 1) == k) {
                // Check if queue has any negative number for the current window
                if (queue.isEmpty()) {
                    list.add(0); // No negative number in the current window
                } else {
                    list.add(queue.peek()); // First negative number in the queue
                    // If the element at window start is the same as the queue's front, remove it
                    if (arr[i] == queue.peek()) {
                        queue.poll();
                    }
                }

                // Slide the window
                i++;
                j++;
            }
        }

        // Output the result
        System.out.println(list);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the window size");

        int k = sc.nextInt();
        firstNegative(arr, k);
        sc.close();
    }
}

// brute force approach:
// import java.util.*;

// public class BruteForceFirstNegative {
// public static void main(String[] args) {
// // Input array size
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter array size n > ");
// int n = sc.nextInt();

// int[] arr = new int[n];
// System.out.println("Enter array values > ");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// // Input window size
// System.out.print("Enter window size k > ");
// int k = sc.nextInt();

// // List to store the result
// List<Integer> result = new ArrayList<>();

// // Iterate over all possible windows of size k
// for (int i = 0; i <= n - k; i++) {
// // Initialize a flag to check if we found a negative number
// boolean foundNegative = false;

// // Check each element in the current window of size k
// for (int j = i; j < i + k; j++) {
// if (arr[j] < 0) {
// result.add(arr[j]); // First negative number in the window
// foundNegative = true;
// break;
// }
// }

// // If no negative number was found, add 0
// if (!foundNegative) {
// result.add(0);
// }
// }

// // Output the result
// System.out.println(result);
// }
// }

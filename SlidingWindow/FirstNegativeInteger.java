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

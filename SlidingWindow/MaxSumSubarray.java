package SlidingWindow;

import java.util.*;

public class MaxSumSubarray {

    public static int MaxSum(int[] arr, int k) {

        int sum = 0;
        int i = 0, j = 0;
        int maxsum = Integer.MIN_VALUE;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 == k) {
                maxsum = Math.max(maxsum, sum);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return maxsum;

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
        System.out.println("The maximum subarray sum is:" + MaxSum(arr, k));
        sc.close();
    }
}

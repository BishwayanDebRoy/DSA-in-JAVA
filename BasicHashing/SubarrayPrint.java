package BasicHashing;

import java.util.*;

public class SubarrayPrint {
    // with hashset logic:
    public static void subarraySum(int arr[], int sum) {
        int currSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currSum - sum)) {
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        if (end == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println(start + "," + end);
        }
    }

    // without hashset logic code:
    // public static void printSubarray(int arr[], int sum) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i; j < arr.length; j++) {
    // int currSum = 0;
    // for (int k = i; k <= j; k++) {
    // currSum += arr[k];
    // }
    // if (currSum == sum) {
    // System.out.println("Subarray found between index " + i + " and " + j);
    // System.out.print("The subarray is: ");

    // for (int k = i; k <= j; k++) {
    // System.out.print(arr[k] + " ");
    // }
    // System.out.println();
    // return;
    // }
    // }
    // }
    // System.out.println("No subarray with the given sum found.");

    // }

    public static void main(String[] args) {
        int arr[] = { 10, 15, -5, 15, -10, 5 };
        int sum = 5;
        // printSubarray(arr, sum);
        subarraySum(arr, sum);
    }
}

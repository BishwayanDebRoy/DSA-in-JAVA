package Searching;

import java.util.*;

public class LinearSearch {

    public static void LinearSearch(int arr[], int k) {
        boolean iskey = false;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                System.out.println("The key" + " " + k + " " + "is found at index" + " " + i);
                iskey = true;
                break;
            }
        }
        if (!iskey) {

            System.out.println("key not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        LinearSearch(arr, key);
        sc.close();
        ;
    }
}

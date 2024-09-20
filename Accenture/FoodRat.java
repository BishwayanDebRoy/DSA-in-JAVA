package Accenture;

import java.util.*;

public class FoodRat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = r * unit;
        int sum = 0;
        int count = 0;
        if (arr.length == 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < res) {
                sum += arr[i];
                count++;
            }
            if (sum >= res) {
                System.out.println(count);
                return;
            }

        }
        System.out.println(0);
        sc.close();

    }
}

// package Accenture;

// import java.util.*;

// public class FoodRat {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int r = sc.nextInt(); // Number of rats
// int unit = sc.nextInt(); // Food required by each rat
// int n = sc.nextInt(); // Number of houses
// int arr[] = new int[n]; // Food in each house

// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// // Check if the array is null or empty
// if (arr == null || arr.length == 0) {
// System.out.println(-1);
// return;
// }

// // Total food required for all the rats
// int totalFoodRequired = r * unit;
// int sum = 0;
// int count = 0;

// // Traverse the array and calculate how many houses are needed
// for (int i = 0; i < n; i++) {
// sum += arr[i];
// count++;
// if (sum >= totalFoodRequired) {
// System.out.println(count); // Print the number of houses required
// return;
// }
// }

// // If total food is not sufficient
// System.out.println(0);
// sc.close();
// }
// }

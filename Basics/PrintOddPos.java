package Basics;

public class PrintOddPos {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 1; i < arr.length; i = i + 3) {
            System.out.println(arr[i]);
        }
    }
}
//comment added
package Accenture;

public class AbsoluteSum {
    public static int findCount(int arr[], int length, int num, int diff) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - num) <= diff) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = { 12, 3, 14, 56, 77, 13 };
        int num = 13;
        int diff = 2;
        System.out.println(findCount(arr, diff, num, diff));
    }
}

package BasicHashing;

import java.util.*;

public class CountDistinctHashSet {

    public static int CountDistinct(int arr[]) {
        Set<Integer> set = new HashSet<>();
        for (int a : arr) {
            set.add(a);
        }

        return set.size();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The no. of distinct elements is:" + CountDistinct(arr));

    }
}

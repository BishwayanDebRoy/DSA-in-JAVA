package BasicHashing;

import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for (int i = 0; i < num; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("Enter the no. of query:");
        int query = sc.nextInt();
        while (query > 0) {
            System.out.println("Enter the query");
            int number = sc.nextInt();
            System.out.println("The no. of times " + number + " " + " appears is " + " " + hash[number]);
            query--;
        }
        sc.close();

    }
}

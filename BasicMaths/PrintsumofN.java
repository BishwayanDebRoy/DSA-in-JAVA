package BasicMaths;

import java.util.*;

public class PrintsumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                continue;
            } else {
                count = count + i;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

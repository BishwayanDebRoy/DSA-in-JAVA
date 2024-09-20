package Accenture;

import java.util.*;

public class DifferenceOfSum {
    public static int diffSum(int n, int m) {
        int sumofM = 0;
        int sumofN = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n != 0) {
                sumofM += i;
            } else {
                sumofN += i;
            }
        }
        return sumofM - sumofN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(diffSum(n, m));
        sc.close();

    }
}

package BasicHashing;

import java.util.*;

public class UnionofArray {

    public static int UnionofArray(int a[], int b[]) {

        Set<Integer> set = new HashSet<>();
        for (int x : a) {
            set.add(x);
        }
        for (int x : b) {
            set.add(x);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 5, 10, 15, 5 };
        int b[] = { 10, 15, 4, 5 };
        System.out.println("unique elements in union of arrays is:" + UnionofArray(a, b));
        sc.close();

    }
}

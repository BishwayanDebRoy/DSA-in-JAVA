package BasicHashing;

import java.util.*;

public class IntersectionofArray {
    public static int Intersection(int a[], int b[]) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int x : a) {
            set.add(x);
        }
        for (int x : b) {
            if (set.contains(x)) {
                count++;
                set.remove(x);
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 3, 4, 5, 1 };
        System.out.println("the unique elements in the intersectin of set are: " + Intersection(a, b));
    }
}

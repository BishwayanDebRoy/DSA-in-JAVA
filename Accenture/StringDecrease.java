package Accenture;

import java.util.*;

public class StringDecrease {

    public static String stringDecrease(String str) {
        int n = str.length();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        char currentchar = str.charAt(0);
        for (int i = 1; i < n; i++) {
            if (currentchar == str.charAt(i)) {
                count++;
            } else {
                sb.append(currentchar);
                sb.append(count);
                currentchar = str.charAt(i);
                count = 1;
            }

        }
        sb.append(currentchar);
        sb.append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String result = stringDecrease(str);
        System.out.println("The decreased string is: " + " " + result);

    }
}

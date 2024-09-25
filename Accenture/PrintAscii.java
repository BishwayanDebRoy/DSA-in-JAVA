package Accenture;

import java.util.*;

public class PrintAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        int ascii = (int) str.charAt(0);

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is:" + rev);
        if (rev.equals(str)) {
            System.out.println(str.length());
        } else {
            System.out.println(ascii);
        }
        sc.close();
    }
}
//comment added
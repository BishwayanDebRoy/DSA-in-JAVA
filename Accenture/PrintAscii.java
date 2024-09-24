package Accenture;

import java.util.*;

public class PrintAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        int ascii = (int) str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        if (rev.equals(str)) {
            System.out.println(str.length());
        } else {
            System.out.println(ascii);
        }
        sc.close();
    }
}

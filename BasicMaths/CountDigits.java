// Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

// Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.

// Examples :

// Input: n = 12
// Output: 2
// Explanation: 1, 2 when both divide 12 leaves remainder 0.
// Input: n = 2446
// Output: 1
// Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not

package BasicMaths;

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int originalNum = num;
        while (num != 0) {
            int lastdigit = num % 10;
            if (lastdigit != 0 && originalNum % lastdigit == 0) {
                count++;
            }
            num /= 10;
        }
        System.out.println("The no. of digits in n which evenly divides n is:" + count);
        sc.close();
    }
}

// This code is optimised by making sure the last digit is not empty and the
// original number is compared to check if it is divisible by the last digit or
// not if so then count is updated or else the next number is accessed.
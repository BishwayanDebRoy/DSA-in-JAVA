//An armstrong no. is a no. that is equal to the sum of the cube of each digit of the number
//EG: for 371 , by adding the digits we get: 3^3+7^3+1^3=371

//which is same as the original no. so thus it is an armstront no.

package BasicMaths;

import java.util.*;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orgnum = num;
        int armstrongno = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            armstrongno += (lastdigit * lastdigit * lastdigit);
            num /= 10;

        }
        if (orgnum == armstrongno) {

            System.out.println(orgnum + "is an Armstrong No.");
        } else {
            System.out.println(orgnum + "is not an Armstrong No.");
        }
        sc.close();
    }
}
//armstrong no. is learnt

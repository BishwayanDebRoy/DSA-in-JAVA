package Basics;

import java.util.*;

//program to calculate cost of item bought and adding gst to the total bill.
public class Variables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float tot_cost = pencil + pen + eraser;
        float new_cost = tot_cost + (0.18f) * tot_cost;
        System.out.println("The total cost without gst is  " + tot_cost);
        System.out.println("The total cost adding gst is  " + new_cost);
        sc.close();
    }
}
// VARIABLES IS LEARNT
package Basics;

import java.util.*;

public class GCDandLCM {
    public static void main(String[] args) {
        // formula GCD*LCM = NUMBER1 * NUMBER2;
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int gcd = gcd(num1, num2);
        int lcm = (num1 * num2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int gcd(int num1, int num2) {
        int rem = num1 % num2;
        while (rem != 0) {
            int temp = num2;
            num2 = rem;
            num1 = temp;
            rem = num1 % num2;
        }
        return num2;
    }
}

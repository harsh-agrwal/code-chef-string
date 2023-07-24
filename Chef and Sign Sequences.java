/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / (gcd(a, b));
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        // long mod = 1000_000_007l;
        while (test-- > 0) {
            String s = sc.next();
            int i = 0, n = s.length();
            // ArrayList<Integer> list = new ArrayList<>();
            int count = 0, l = 0, r = 0;
            while (i < n) {
                if (s.charAt(i) == '<') {
                    l++;
                    r = 0;
                    count = Math.max(count, l);
                } else if (s.charAt(i) == '>') {
                    r++;
                    l = 0;
                    count = Math.max(count, r);
                }
                i++;
            }

            System.out.println(count + 1);
        }
    }
}

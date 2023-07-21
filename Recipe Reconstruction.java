/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static boolean isPalandrome(char ch[]) {
        int i = 0, j = ch.length - 1;
        while (i < j) {
            if (ch[i] != ch[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.next();
            char ch[] = s.toCharArray();
            long mod = 1000_00_09l;
            int i = 0, j = s.length() - 1;
            long ans = 1;
            boolean found = true;
            while (i <= j) {
                char x = s.charAt(i);
                char y = s.charAt(j);
                if (x != '?' && y != '?' && x != y) {
                    ans = 0;
                    break;
                } else if (x == '?' && y == '?') {
                    ans = (ans % mod * 26l % mod) % mod;
                }
                i++;
                j--;
            }
            System.out.println(ans);
        }
    }
}

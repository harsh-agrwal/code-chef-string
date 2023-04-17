/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int temp = n;
            int reverse = 0;
            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
            if (n == reverse) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
        sc.close();
		// your code goes here
	}
}

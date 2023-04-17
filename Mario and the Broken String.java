/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String a = s.substring(0, n/2);
            String b = s.substring(n/2, n);
            String c = b + a; // Joining in order AB
            String d = a + b; // Joining in order BA
            if (c.equals(s) || d.equals(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        scanner.close();
		// your code goes here
	}
}

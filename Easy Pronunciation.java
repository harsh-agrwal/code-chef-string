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
        sc.nextLine(); // consume the newline character left by nextInt()
        
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine(); // consume the newline character left by nextInt()
            String s = sc.nextLine();
            
            boolean easy = true;
            int count = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count = 0;
                } else {
                    count++;
                    if (count >= 4) {
                        easy = false;
                        break;
                    }
                }
            }
            
            if (easy) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
		// your code goes here
	}
}

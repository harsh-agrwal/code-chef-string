/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   private static final Scanner sc = new Scanner(System.in);
    
	public static void main (String[] args) throws java.lang.Exception
	{
		    solve();
	}
	
	private static void solve() {
        int n = sc.nextInt();
        int count = 0;
        String binary = sc.next();
        
        for(int i=n-1; i >= 0 && binary.charAt(i) == '0'; i--) {
            count++;
        }
        System.out.println(count);
	}
}
	

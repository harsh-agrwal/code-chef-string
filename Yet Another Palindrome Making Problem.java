/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   private static final Scanner sc = new Scanner(System.in);
    
	public static void main (String[] args) throws java.lang.Exception
	{
		for(int tests = sc.nextInt(); tests > 0; tests--)
		    solve();
	}
	
	private static void solve() {
        int n = sc.nextInt();
        String str = sc.next();
        
        char[] arr0 = new char[n/2];
        char[] arr1 = new char[n/2];
        
        for(int i = 0, j = 1, k = 0; j < str.length(); i += 2, j += 2, k++) {
            arr0[k] = str.charAt(i);
            arr1[k] = str.charAt(j);
        }
        
        Arrays.sort(arr0);
        Arrays.sort(arr1);
        
        for(int i=0; i<arr0.length; i++) 
            if(arr0[i] != arr1[i]) { System.out.println("NO"); return; } 
            
        System.out.println("YES");
	}
}
	

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
        String str = sc.next();
        char[] arr0 = str.toCharArray();
        char[] arr1 = str.toCharArray();
        int ops0 = 0, ops1 = 0;
        if(str.charAt(0) == '-') { arr1[0] = '+'; ops1++; }
        else { arr0[0] = '-'; ops0++; }
        for(int i=1; i < arr0.length; i++) {
            if(arr0[i] == arr0[i-1]) { 
                if(arr0[i] == '-') arr0[i] = '+';
                else arr0[i] = '-';
                ops0++; }
            if(arr1[i] == arr1[i-1]) { 
                if(arr1[i] == '-') arr1[i] = '+';
                else arr1[i] = '-';
                ops1++; }
        }
        System.out.println(ops0 <= ops1? ops0: ops1);
	}
}
	

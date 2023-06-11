/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    private static final Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		for(int tests = sc.nextInt(); tests > 0; tests--)
		    solve();
	}
	private static void solve() {
        String str = sc.next();
        System.out.println(isPossible(str));
	}
	private static String isPossible(String str) {
	    char[] arr = str.toCharArray();
	    int l = 0, r = arr.length - 1;
	    while(l <= r) {
	        if(arr[l] == '.' && arr[r] == '.') arr[l] = arr[r] = 'a';
	        else if(arr[l] == '.') arr[l] = arr[r];
	        else if(arr[r] == '.') arr[r] = arr[l];
	        else if(arr[l] != arr[r]) return "-1";
	        l++; r--;
	    }
	    return new String(arr);
	}
}
	

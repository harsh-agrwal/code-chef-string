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
        int ans = isLovely(str);
        
        if(ans == 0) System.out.println("normal");
        else System.out.println("lovely" + " " + ans);
        
	}
	
	private static int isLovely(String str) {
	    final String chef = "chef";
	    int l = 0, r = chef.length(), count = 0;
	    
	    while(r <= str.length()) {
	        if(isAnagram(str.substring(l, r), chef)) count++;
	        l++; r++;
	    }
	    
	    return count;
	}
	
	private static boolean isAnagram(String strA, String chef) {
	    int[] arr = new int[4];
	    
        for(int i = 0; i < strA.length(); i++) {
            char ch = strA.charAt(i);
            if(ch == 'c') arr[0]++;
            else if(ch == 'h') arr[1]++;
            else if(ch == 'e') arr[2]++;
            else if(ch == 'f') arr[3]++;
        }
        
        for(int i = 0; i<4; i++) {
            if(arr[i] != 1) return false;
        }
        
        return true;
	}
}
	

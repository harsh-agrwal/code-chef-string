/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		while(tc!=0){
		    String str=s.next();
		    int res=solve(str);
		    System.out.println(res);
		    tc--;
		}
	}
	static int solve(String s){
	    int n=s.length();
	    if(s.charAt(0)!=s.charAt(n-1))
	        return 2;
	    else
	        return n-2;
	}
}

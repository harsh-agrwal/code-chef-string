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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String str=sc.next();
		    
		    int count=0;
		    if(str.length()>0 && str.charAt(0)=='0')
		    count++;
		    
		    for(int i=1;i<str.length();i++)
		    {
		        if(str.charAt(i)!=str.charAt(i-1))
		         count++;
		    }
		    
		    System.out.println(count);
		    
		}
	}
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    String ans="impossible";
		    if(b>2 && a%b==0)
		    {
		        if(b%2==0)
		        {
		            
		            int k=(b-2)/2;
		            String v="a".repeat(k)+"bb"+"a".repeat(k);
		            ans=v.repeat(a/b);
		            
		        }
		        else
		        {
		            int m=(b-1)/2;
		            String c="a".repeat(m)+"b"+"a".repeat(m);
		            ans=c.repeat(a/b);
		        }
		    }
		    System.out.println(ans);
		}
		// your code goes here
	}
}

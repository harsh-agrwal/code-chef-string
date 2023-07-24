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
		int test=sc.nextInt();
		while(test-->0)
		{   
		    int n=sc.nextInt();
		    String s=sc.next();
		    int i,j;
		    int count=0;
		    for(i=0;i<n;i++)
		    {
		        for(j=i+1;j<=Math.min(i+9,n-1);j++)
		        {
		            int x=s.charAt(i)-'0';
		            int y=s.charAt(j)-'0';
		            if(Math.abs(y-x)==j-i)
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}

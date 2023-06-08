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
		while(t--!=0)
		{
		    int  n=sc.nextInt();
		    int  x=sc.nextInt();
		    if((n+1)/2<x)
		    System.out.print(-1);
		    else
		    {
		        char[] arr=new char[n];
		        Arrays.fill(arr,'a');
		        for(int i=0;i<x;i++)
		        arr[i]=arr[n-1-i]=(char)('a'+i);
		        
		        for(int i=0;i<n;i++)
		        System.out.print(arr[i]);
		    }
		    System.out.println();
		}
	}
}

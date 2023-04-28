/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t-->0)
	{
	    int flag=0;
	    int ar[]=new int[256];
	    int n=s.nextInt();
	    String str=s.next();
	    for(int i=0;i<n;i++)
	    {
	        int a=str.charAt(i);
	        if(ar[a]==1)
	        {
	            flag=1;
	            break;
	        }
	        else 
	        ar[a]=1;
	    }
	    
	   if(flag==0)System.out.println(-1);
	   else System.out.println(n-2);
	}
	}
}

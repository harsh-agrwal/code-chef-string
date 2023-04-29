/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    String str=in.next();
		    boolean ans=true;
		    int [] a=new int[26];
		    for(int i=0;i<n;i++)
		    {
		        a[str.charAt(i)-97]++;
		    }
		    for(int i=0;i<26;i++)
		    {
		        if(a[i]%2!=0)
		        ans=false;
		    }
		    if(ans)
		    {
		        System.out.println("YES");
		    }
		    else
		    System.out.println("NO");
		}
	}
}

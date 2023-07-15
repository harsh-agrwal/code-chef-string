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
		Scanner r = new Scanner(System.in);
		int t=r.nextInt();
		for(int ii=0;ii<t;ii++)
		{
		    int h=r.nextInt();
		    int m=r.nextInt();
		    int count1=0;
		    int count2=0;
		    for(int i=0;i<h;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            String a=Integer.toString(i);
		            String b=Integer.toString(j);
		            String c=a+b;
		            int l=c.length();
		            char d=c.charAt(0);
		           // System.out.println(c);
		            for(int iii=0;iii<l;iii++)
		            {
		                if(d==c.charAt(iii))
		                {
		                    count1++;
		                }
		            }
		            if(count1==l)
		            {
		                count2++;
		                
		            }
		            count1=0;
		        }
		    }
		    System.out.println(count2);
		    
		}
		
	}
}

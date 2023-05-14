/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sca=new Scanner(System.in);
		short t=sca.nextShort();
		while(t-->0)
		{
		    String str=sca.next();
		    String ptr=sca.next();
		    StringBuffer gtr=new StringBuffer();
		    int total_one=0;
		    int total_zero=0;
		    for(int i=0;i<str.length();i++)
		    {
		        if(str.charAt(i)=='1')
		         total_one++;
		        else
		          total_zero++;
		          
		         if(ptr.charAt(i)=='1')
		          total_one++;
		         else
		           total_zero++;
		    }
		   
		   for(int i=0,left=0;i<str.length();i++,left++)
		     {
		         if(total_zero>left  && total_one>left)
		            gtr.append('1');
		          else
		            gtr.append('0');
		     }
		    
		    System.out.println(gtr);
		}
	}
}

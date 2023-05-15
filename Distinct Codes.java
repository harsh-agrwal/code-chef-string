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
		    HashSet<String> set =new HashSet<>();
		    int count=0;
		    for(int i=0;i<str.length()-1;i++)
		    {
		        
		        String st=""+str.charAt(i)+str.charAt(i+1);
		        if(set.contains(st))
		        {
		            continue;
		        }
		        else
		        {
		            set.add(st);
		            count++;
		        }
		    }
		    
		    System.out.println(count);
		    
		}
	}
}

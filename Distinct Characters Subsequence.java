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
		    HashSet<Character> set=new HashSet<>();
		    for(int i=0;i<str.length();i++)
		    {
		       char ch=str.charAt(i);
		        set.add(ch);
		        
		    }
		    
		    System.out.println(set.size());
		}
	}
}

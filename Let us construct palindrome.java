/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            t--;
            String str=sc.next();
            int i=0, j= str.length()-1;
            while(i<j && str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
           boolean ans=  match(str, i+1, j);
          ans = ans ||   match(str, i, j-1);
          
          if(ans)
          System.out.println("YES");
          else 
          System.out.println("NO");
        }
	}
	public static boolean match(String str, int i , int j)
	{
	    while(i<j)
	    {
	        if(str.charAt(i)!=str.charAt(j))
	            return false;
	            i++;
	            j--;
	    }
	    return true;
	}
}

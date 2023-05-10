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
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<T;i++){
		    int flag =0;
		    String s = sc.nextLine();
		   for(int j=0;j<s.length()-2;j++){
		       String x = s.substring(j,j+3);
		       if(x.equals("010")||x.equals("101"))
		        {
		            flag = 1;
		            break;
		        }
		       else
		            flag = 0;
		   }
		   if(flag==1)
		        System.out.println("Good");
		   else 
		        System.out.println("Bad");
		}
	}
}

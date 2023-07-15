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
		int testcase=sc.nextInt();
		sc.nextLine();
		while(testcase-->0)
		{
		    
		   String s=sc.nextLine();
		   boolean flag=false;
		  
		   if(s.length()==5)
		   {
		     
		           if((s.charAt(0)>='a'&&s.charAt(0)<='h')&&(s.charAt(3)>='a'&&s.charAt(3)<='h')&&(s.charAt(1)>='1'&&s.charAt(1)<='8')&&s.charAt(4)>='1'&&s.charAt(4)<='8'&&s.charAt(2)=='-')
		           {
		              flag=true;
		              int diff1=Math.abs(s.charAt(0)-s.charAt(3));
		              int diff2=Math.abs(s.charAt(1)-s.charAt(4));
		              
		              
		              if(diff1==1&&diff2==2||diff1==2&&diff2==1)
		              {
		               System.out.println("Yes");
		              }
		              else
		              {
		                  System.out.println("No");
		              }
		           }
		          
		           else{
		               System.out.println("Error");
		           }
		           
		               
		                
		       
		   }
		   else
		   {
		       System.out.println("Error");
		   }
		
		        
		}
	}
}

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
		while(t-->0){
		    int n=sc.nextInt();
		   	StringBuilder x = new StringBuilder();
		    for(int i=0;i<n;i++){
		      String s=sc.next();
		       if(s.charAt(i)=='0'){
		           x.append('1');
		       }else{
		           x.append('0');
		       }
	        }
		    System.out.println(x.toString());
		}
	}
}

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
		    int a=sc.nextInt();
		    String b=sc.next();
		    boolean flag=false;
		    for(int i=0;i<a;i++)
		    if(b.charAt(i)=='0'|| b.charAt(i)=='5')
		    flag=true;
		    if(flag)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}

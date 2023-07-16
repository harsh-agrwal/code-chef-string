/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		   String s=sc.next();
		   int l=s.indexOf("W");
		   int r=s.length()-l-1;
		   if(l!=r)System.out.println("Aleksa");
		   else System.out.println("Chef");
		}
	}
}

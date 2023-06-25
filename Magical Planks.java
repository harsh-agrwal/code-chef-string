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
		   int n=sc.nextInt(),g=0;
		   String s=sc.next();
		   for (int i=0; i<s.length(); i++){
		       while(i+1<n && s.charAt(i)==s.charAt(i+1)){
		           i++;
		       }
		       g++;
		   }
		   int o=0;
		   if (g%2 == 0){
		       o=g/2;
		   }else{
		       o=(g-1)/2;
		   }
		   System.out.println(o);
		}
	}
}

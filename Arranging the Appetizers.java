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
		    int k=sc.nextInt();
		    String s=sc.next();
		    String answer="";
		 for(int i=0;i<s.length();i++){
		     String binarystring="";
		     binarystring=Integer.toBinaryString(i);
		     int length=binarystring.length();
		     if(binarystring.length()<k){
		         for(int j=1;j<=k-length;j++){
		             binarystring="0"+binarystring;
		         }
		     }
		     StringBuilder inverted=new StringBuilder(binarystring);
		     binarystring=inverted.reverse().toString();
		     int index=0;
		     index=Integer.parseInt(binarystring,2);
		     answer+=s.charAt(index);
		 }
		 System.out.println(answer);
		}
	}
}

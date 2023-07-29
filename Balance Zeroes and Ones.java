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
		int t = sc.nextInt();
		while(t-- >0){
		   int n = sc.nextInt();
		   String str = sc.next();
		   StringBuilder sbd = new StringBuilder("");
		   int zero = 0;
		   int one = 0;
		   for (int i = 0; i<n ; i++ ) {
		       if(str.charAt(i) == '0'){
		           zero++;
		       }
		       else if(str.charAt(i) == '1'){
		           one++;
		       }
		   }
		   for(int i = 0; i<n; i++){
		       if(str.charAt(i) == '1'){
		           sbd.append(1);
		       }
		       else if(str.charAt(i) == '0'){
		           sbd.append(0);
		       }
		       else{
		           if(zero<one){
		               sbd.append(0);
		               zero++;
		           }
		           else{
		               sbd.append(1);
		               one++;
		           }
		       }
		   }
		   System.out.println(sbd.toString());
		}
	}
}

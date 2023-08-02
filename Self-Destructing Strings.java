/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t= sc.nextInt();
	    while(t-->0)
	    {
	        String s = sc.next();
	        int c1 =0,c0=0;
	        for( int i=0;i<s.length();i++){
	            if(s.charAt(i)== '1')
	            {
	                c1++;
	            }
	            else{
	                c0++;
	                
	            }
            }
            if(c1==0||c0==0||s.length()%2!=0)
            {
                System.out.println(-1);
                }
            else
            {
                System.out.println(Math.abs(c1-c0)/2);
            }
        }
    }
}

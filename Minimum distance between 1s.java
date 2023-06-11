/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    while(t>0) {
	        int n = input.nextInt();
	        String s = input.next();
	        int count=0;
	        int tmp=0;
	        int minn=0;
	        boolean check = false;
	        if(n==2) System.out.println(1);
	        else {
	            for (int i=0;i<n;i++) {
	                if(i%2==0 && s.charAt(i)=='1') count++;
	                else if (i%2==1 && s.charAt(i)=='1') tmp++;
	                if(count>0 && tmp>0) {
	                    check = true;
	                    break;
	                }
	            }
	            if(check) System.out.println(1);
	            else System.out.println(2);
	        }
	        t--;
	    }
    }
}

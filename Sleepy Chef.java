/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int st = scan.nextInt();
		    String s = scan.next();
		    s+="1";
		  //  System.out.println(s);
		    int ocount = 0;
		    int count = 0;
		    
		    for(int i= 0 ; i < n+1 ;i++){
		        char ch = s.charAt(i); 
		      //  System.out.println("char "+ ch);
		        if(ch=='0'){
		            count++;
		        }else{
		            if(count!=0){
		              //  System.out.println("count " + count);
		                ocount+=count/st;
		                count = 0;
		            }
		        }
		      //  System.out.println(count +"c");
		    }
		    
		    System.out.println(ocount);
		    
		}
	}
}

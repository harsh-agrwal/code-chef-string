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
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		String str=s.next();
		while(t-->0){
		    String a=s.next();
		    String ans="";
		    for(int i=0;i<a.length();i++){
		        if(a.charAt(i)=='_'){
		            ans=ans+" ";
		        }else if(a.charAt(i)=='.'||a.charAt(i)==','||a.charAt(i)=='!'||a.charAt(i)=='?'){
		            ans=ans+a.charAt(i);
		        }else{
		            int b=(int)(a.charAt(i));
		            if(b>=65&&b<=90){
		                b=b-65;
		                char d=str.charAt(b);
		                d = Character.toUpperCase(d);
		                ans=ans+d;
		            }else{
		                ans=ans+str.charAt(b-97);
		            }
		            
		        }
		    }
		    System.out.println(ans);
		}
	}
}

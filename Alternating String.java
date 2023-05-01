/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static int maxLength(int n,String str){
        int countZero=0;
        int countOne=0;
        
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0') countZero++;
            else countOne++;
        }
        
        if(countZero==countOne) return 2*countZero;
        else if(countZero<countOne) return (2*countZero)+1;
        else return (2*countOne)+1;
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++){
		    
		    int N=sc.nextInt();
		    String str=sc.next();
		    
		    System.out.println(maxLength(N,str));
		}
	}
}

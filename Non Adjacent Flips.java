/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static int noOfFlips(int n,String str){
        
        int count=0;
        if(str.charAt(0)=='1') count++;
        
        for(int i=1;i<n;i++){
            if(str.charAt(i)=='1' && str.charAt(i-1)=='1') return 2;
            if(str.charAt(i)=='1') count++;
        }
        if(count==0) return 0;
        return 1;
    }
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++){
		    
		    int N=sc.nextInt();
		    String str=sc.next();
		    
		    System.out.println(noOfFlips(N,str));
		}
	}
}

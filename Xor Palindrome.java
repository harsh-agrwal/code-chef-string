/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s=sc.next();
		    int one=0,zero=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='1'){
		            one++;
		        }else{zero++;}
		    }
		    int flag=0;
		 
		    for(int j=0;j<n/2;j++){
		       
		        if(s.charAt(j)!=s.charAt(n-j-1))
		        {  
		            flag++;
		        }
		    }
		    
		    
		        System.out.println((flag+1)/2);
		
		}
	}
}

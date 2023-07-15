/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int x=s.nextInt();
		    int y=s.nextInt();
		    if((x%2==1 && y%2==1)||(x==1||y==1)){
		        System.out.println("-1");
		        continue;
		    }
		    String str1="";
		    String str2="";
		    String te="";
	        for(int i=0;i<x/2;i++) str1=str1+'a';
	        for(int i=0;i<y/2;i++) str2=str2+'b';
	        te=str1;
	        if(x%2==1) {
	            str1=str1+str2+'a'+str2+str1;
	            str2=str2+te+'a'+te+str2;
	        }
		    else if(y%2==1) {
		        str1=str1+str2+'b'+str2+str1;
		        str2=str2+te+'b'+te+str2;
		    }
	        else {
	            str1=str1+str2+str2+str1;
	            str2=str2+te+te+str2;
	        }
	        if(str1.equals(str2)){
	            System.out.println("-1");
	            continue;
	        }
	        System.out.println(str1);
	        System.out.println(str2);
		}
	}
}

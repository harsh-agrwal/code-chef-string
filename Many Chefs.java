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
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		int cases=Integer.parseInt((in.readLine()).trim());
		for(int i1=0;i1<cases;i1++){
		    String s1=in.readLine();
		    StringBuilder ss=new StringBuilder(s1);
		    int size=s1.length();
		    if(size<4){
		        for(int i2=0;i2<size;i2++){
		            if(ss.charAt(i2)=='?'){
		                ss.setCharAt(i2,'A');
		            }
		        }
		    }
		    else{
		        int j4=size-1;
		        int j3=j4-1;
		        int j2=j3-1;
		        int j1=j2-1;
		        while(j1>=0){
		            if(((ss.charAt(j1)=='C')||(ss.charAt(j1)=='?'))&&((ss.charAt(j2)=='H')||(ss.charAt(j2)=='?'))&&((ss.charAt(j3)=='E')||(ss.charAt(j3)=='?'))&&((ss.charAt(j4)=='F')||(ss.charAt(j4)=='?'))){
		                ss.setCharAt(j1,'C');
		                ss.setCharAt(j2,'H');
		                ss.setCharAt(j3,'E');
		                ss.setCharAt(j4,'F');
		            }
		            j4--;j1--;j2--;j3--;
		        }
		    }
		    for(int i2=0;i2<size;i2++){
		        if(ss.charAt(i2)=='?'){
		            ss.setCharAt(i2,'A');
		        }
		    }
		    out.write(ss.toString());out.write("\n");
		    out.flush();
		}
	}
}

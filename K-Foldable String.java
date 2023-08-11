import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    String s=sc.next();
		    int c0=0;
		    int c1=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='0'){
		            c0++;
		        }
		        else{
		            c1++;
		        }
		    }
		    int total=n/k;
		    if(c0%total==0&&c1%total==0){
		        String ans="";
		        for(int i=0;i<total;i++){
		            if(i%2==0){
		               for(int j=0;j<c0/total;j++){
		                   ans+="0";
		               } 
		               for(int j=0;j<c1/total;j++){
		                   ans+="1";
		               }
		            }
		            else{
		                 for(int j=0;j<c1/total;j++){
		                   ans+="1";
		               } 
		               for(int j=0;j<c0/total;j++){
		                   ans+="0";
		               }
		            }
		        }
		        System.out.println(ans);
		    }
		    else{
		        System.out.println("IMPOSSIBLE");
		    }
		}
	}
}

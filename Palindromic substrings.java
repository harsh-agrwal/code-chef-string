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
		int T = sc.nextInt();
		while(T>0){
		    String a = sc.next();
		    String b = sc.next();
		    
		    boolean answer = false;
		    if(a.length() <= b.length()){
		        for (int i=0; i<a.length() ; i++){
		            if(b.indexOf((a.substring(i, i+1))) != -1){
		                answer = true;
		                break;
		            } 
		        } 
		    }else{
		        for (int i=0; i<b.length() ; i++){
		            if(a.indexOf((b.substring(i, i+1))) != -1){
		                answer = true;
		                break;
		            } 
		        } 
		    }
		    if(answer)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    T--;
		}
	}
}

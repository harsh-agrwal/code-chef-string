/* package codechef; // don't place package name! */

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
		    String s[]=new String[n];
		    for(int i=0;i<n;i++){
		        s[i]=sc.next();
		    }
		    byte hero=0;
		    for(int i=0;i<n;i++) {
		        int x=s[i].length();
		        if(x>2) s[i]=(s[i].substring(x-3));
		    }
		    for(int i=0;i<n;i++){
		        if(s[i].equals("man")) hero++;
		        else hero--;
		        if(hero>=2) {System.out.println("superheroes"); break;}
		        if(hero<=-3) {System.out.println("villains"); break;}
		    }
		    if(hero<2&&hero>-3) System.out.println("draw");
		}
	}
}

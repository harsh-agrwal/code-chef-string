/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here]\
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    String arr[]=new String[N];
		    for(int i=0;i<N;i++)
		    arr[i]=sc.next();
		    String Res="";
		    for(int i=0;i<K;i++)
		    {
		        int L=sc.nextInt();
		        for(int j=0;j<L;j++)
		        {
		            String S=sc.next();
		            Res=Res+S+" ";
		        }
		    }
		    for(int i=0;i<N;i++)
		    {
		        if(Res.contains(arr[i]))
		        {
		            System.out.print("YES ");
		        }
		        else
		        {
		            System.out.print("NO ");
		        }
		    }
		    System.out.println();
		}
	}
}

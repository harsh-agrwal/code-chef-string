/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class fastscanner
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String next()
    {
            while(st==null || !st.hasMoreTokens())
            {
            try{
                    
                st=new StringTokenizer(br.readLine());
            }
        catch(IOException e){}
            }
        return st.nextToken();
    }
    int nextInt()
    {
        return Integer.parseInt(next());
    }
    float nextFloat()
    {
        return Float.parseFloat(next());
    }
    long nextLong()
    {
        return Long.parseLong(next());
    }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    String nextLine()
    {
        String s="";
        try{
            s=br.readLine();
        }
        catch(IOException e){}
        return s;
    }
}



/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  public static int fact(int n)
  {
    int prod=1;
    for(int i=1;i<=n;i++)
    {
      prod*=i;
    }
    return prod;
  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		fastscanner input=new fastscanner();
		PrintWriter output=new PrintWriter(System.out);
	
		  int x=input.nextInt();
		  int n=input.nextInt();
		  int noOfWays=0;
		  
		  for(int ii=0;ii<n;ii++)
		  {
		    String s=input.next();
		    int remainingSeats=0,j=53,k=0;
		    for(int i=0;i<9;i++)
		    {
		      int r1=4,r2=2;
		      while(r1-- >0)
		      {
		        if(s.charAt(k)=='0')
		        {
		          remainingSeats++;
		        }
		        k++;
		      }
		      while(r2-- >0)
		      {
		        if(s.charAt(j)=='0')
		        {
		          remainingSeats++;
		        }
		        j--;
		      }
		     
		      if(x<=remainingSeats)
		      {
		        int tempnoOfWays=((fact(remainingSeats))/((fact(x)*fact(remainingSeats-x))));
		        noOfWays+=tempnoOfWays;
		      }
		      remainingSeats=0;
		    }
		  }
		  
		  output.println(noOfWays);
		
		output.flush();
	}
}

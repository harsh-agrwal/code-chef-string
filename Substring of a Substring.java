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
  public static int helperFunction(String s,int n)
  {
     if(n<=2)
     {
      return -1;
     }
     
      char start=s.charAt(0);
      char end=s.charAt(n-1);
      int len=0,max=0;
      for(int i=1;i<n-1;i++)
      {
        if((s.charAt(i)!=start && s.charAt(i)!=end))
        {
          len++;
          max=(Math.max(len,max));
        }
        else
          len=0;
      }
      if(max>0)
         return max;
         
         
         return -1;
  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		fastscanner input=new fastscanner();
		PrintWriter output=new PrintWriter(System.out);
		int t=input.nextInt();
		while(t-- !=0)
		{
		  String s=input.nextLine();
		  int n=s.length();
		  int ans=(helperFunction(s,n));
		  output.println(ans);
		}
		output.flush();
	}
}

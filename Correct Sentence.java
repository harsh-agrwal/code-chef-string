/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static HashSet<Character> hs1=new HashSet<>();
    public static HashSet<Character> hs2=new HashSet<>();
    public static void init(){
        for(int i=0;i<'m'-'a'+1;i++)
        {
            char a=(char) ('a'+i);
            hs1.add(a);
        }
         for(int i=0;i<'Z'-'N'+1;i++)
        {
            char a=(char)('N'+i);
            hs2.add(a);
        }
    }
    public static boolean notValid(char ch1,char ch2)
    {
        if(hs1.contains(ch1) && !hs1.contains(ch2))
        {
            return true;
        }
        if(hs2.contains(ch1) && !hs2.contains(ch2))
        {
            return  true;
        }
        
        return false;
    }
    public static boolean getAns(String str[])
    {
        int n=Integer.parseInt(str[0]);
        
        
        for(int i=0;i<n;i++)
        {
           
            String temp=str[i+1];
            if(hs1.contains(temp.charAt(0))){
                for(int j=0;j<temp.length();j++)
                {
                    if(!hs1.contains(temp.charAt(j)))
                    {
                        return false;
                    }
                }
            }
            else 
            {
                for(int j=0;j<temp.length();j++)
                {
                    if(!hs2.contains(temp.charAt(j)))
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int not=sc.nextInt();
		sc.nextLine();
        init();
		boolean result[]=new boolean[not];
		for(int i=0;i<not;i++)
		{
		   String input=sc.nextLine();
		   String str[]=input.split(" ");
		  getAns(str);
		  if(getAns(str))
		  {
		      System.out.println("YES");
		  }
		  else {
		      System.out.println("NO");
		  }
		}

	}
}

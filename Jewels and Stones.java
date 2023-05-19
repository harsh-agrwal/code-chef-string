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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String s1=sc.next();
		    String s2=sc.next();
		    HashMap<Character,Integer> map1=new HashMap<>();
		    for(char ch:s1.toCharArray())
		    {
		        map1.put(ch,map1.getOrDefault(ch,0)+1);
		    }
		    int count=0;
		    for(int i=0;i<s2.length();i++)
		    {
		        char ch=s2.charAt(i);
		        if(map1.containsKey(ch))
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}

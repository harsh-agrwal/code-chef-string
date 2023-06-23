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
		   String s=sc.next();
		   Map<Integer,Integer>map=new HashMap<>();
		   for (int i=0; i<s.length(); i++){
		       map.put(s.charAt(i)-'0',map.getOrDefault(s.charAt(i)-'0',0)+1);
		   }
		   String a="";
		   for (int i=65; i<=90; i++){
		       if(i==66 || i==77 || i==88){
		           if(map.containsKey(i%10) && map.get(i%10)>=2)
		           a+=(char)i;
		       }else{
		           if(map.containsKey(i/10) && map.containsKey(i%10) && map.get(i%10)>=1)
		           a+=(char)i;
		       }
		}
		System.out.println(a);
		}
	}
}

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
		 Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
            int m = sc.nextInt();
            HashMap<String,String> hm = new HashMap<>();
            for(int j=0;j<n;j++){
                String str1=sc.next();
                String str2=sc.next();
                hm.put(str1,str2);
            }
            for(int j=0;j<m;j++){
                String str = sc.next();
                if(!str.contains(".")){
                    System.out.println("unknown");
                }
                else{
                    int temp=-1;
                    for(int k=0;k<str.length();k++){
                        if(str.charAt(k)=='.'){
                            temp=k;
                        }
                    }
                    String s = str.substring(temp+1,str.length());
                    if(hm.containsKey(s)){
                        System.out.println(hm.get(s));
                    }
                    else{
                        System.out.println("unknown");
                    }

                }
            }
	}
}

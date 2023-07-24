/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static int count(int index, int n, String str1, String str2){
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = index; i<n ; i+=2 ){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if(ch1 != ch2){
                sum1 = 1;
            }
            else{
                sum2 = sum2+sum1;
                sum1 = 0;
            }
        }
        if(sum1>0){
            sum2 = sum2 + sum1;
        }
        return sum2;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    String str1 = sc.next();
		    String str2 = sc.next();
		    int n = str1.length();
		    int ans = count(0,n,str1,str2)+count(1,n,str1,str2);
		    System.out.println(ans);
		    
		    
		}
	}
}

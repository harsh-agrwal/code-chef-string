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
        int tc = sc.nextInt();
        while (tc-- > 0) 
        {
            StringBuilder sb = new StringBuilder();
            String str = sc.next();
            String c = sc.next();
            int aMax = 0, bMax = 0;
            int a[] = new int[26];
            int b[] = new int[26];
            for(int i=0;i<str.length();i++) 
            {
                a[str.charAt(i) - 'a']++;
            }
            for(int i=0;i<c.length();i++) 
            {
                b[c.charAt(i) - 'a']++;
            }
            for(int i=0;i<26;i++)
            {
                if(a[i] == 0 &&  b[i] > 0)
                {
                    bMax = Math.max(bMax, b[i]);
                }
    
                if(a[i] > 0 &&  b[i] == 0)
                {
                    aMax = Math.max(aMax, a[i]);
                }
            }
            char ans = 'B';
            if(aMax>1 ||aMax == 1 && bMax == 0)
            {
                ans = 'A';
            }
            System.out.println(ans);
        }	
	}
}

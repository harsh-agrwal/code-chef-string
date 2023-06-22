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
		int N = sc.nextInt();
		sc.nextLine();
		String pgm[] = new String[N];
		for(int i = 0; i < N; i++){
		    pgm[i] = sc.nextLine();
		}
		
		Set<String> myset = new LinkedHashSet<String>();

        for (int i = N - 1; i >= 0; i--) {
            if (myset.contains(pgm[i])) {
                continue;
            }  
            myset.add(pgm[i]);
            int len = pgm[i].length();
            String res = pgm[i].substring(len - 2);
            System.out.print(res);;
        }
		
	}
}

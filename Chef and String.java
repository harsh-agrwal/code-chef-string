/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter pt = new PrintWriter(System.out);
		int t = Integer.parseInt(st.nextToken());
		while(t-->0)
		{
		    st = new StringTokenizer(br.readLine());
		    String s = st.nextToken();
		    if(s.length() == 1)pt.println("YES");
		    else{
		        String l = s.substring(1)+""+s.charAt(0);
		        String r = s.charAt(s.length()-1) + "" + s.substring(0,s.length()-1);
		        if(l.compareTo(r) == 0)pt.println("YES");
		        else pt.println("NO");
		    }
		}pt.flush();
	}
}

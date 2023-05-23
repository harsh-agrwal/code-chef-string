/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		s.nextLine();
		while(t-->0){
		    String disign=s.nextLine();
		    String ans=" "+disign+" ";
		    System.out.println((ans.contains(" not "))?"Real Fancy":"regularly fancy");
		}
	}
}

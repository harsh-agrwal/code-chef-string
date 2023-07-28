/* package codechef; // don't place package name! */



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   
	public static void main (String[] args) throws java.lang.Exception
	{
		PrintWriter out = new PrintWriter(System.out);
		FastReader sc = new FastReader();
		int testCases = sc.nextInt();
		while(testCases-->0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    StringBuilder sb = new StringBuilder();
		    while(n>m+1){
		        sb.append("010");
		        n--;
		    }
		    while(m>n+1) {
		        sb.append("101");
		        m--;
		    }
		    String s = "01";
		    if(m>n) s="10";
		    int min=Math.max(n,m);
		    for(int i=0;i<min;i++) sb.append(s);
		    if(n==m) sb.append(s);
		    else if(n>m) sb.append("0");
		    else sb.append("1");
		    out.println(sb.length());
		    out.println(sb.toString());
		    
		    
		    
		}
		out.close();
	}
}


class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(
				new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}

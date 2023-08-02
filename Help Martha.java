import java.io.*;
import java.util.*;
class CENS20G {
	static class FastReader{
		BufferedReader br; StringTokenizer st;
		public FastReader(){
			br=new BufferedReader(new InputStreamReader(System.in)); }
		String next(){
			while(st==null || !st.hasMoreElements())
				try{ st=new StringTokenizer(br.readLine()); }
				catch(IOException e){ e.printStackTrace(); }
			return st.nextToken(); }
		int nextInt(){ return Integer.parseInt(next()); }
	}
	public static void main(String[] args) {
		FastReader in=new FastReader();
		PrintWriter out=new PrintWriter(System.out);
		int tt=in.nextInt();
		for (int t=1; t<=tt; t++) {
			char[] c=in.next().toCharArray();
			int r=0, l=0, u=0, d=0;
			for (char b:c)
				if (b=='R') r++;
				else if (b=='L') l++;
				else if (b=='U') u++;
				else d++;
			int x=in.nextInt(), y=in.nextInt(), q=in.nextInt();
			for (int i=0; i<q; i++) {
				int x1=in.nextInt(), y1=in.nextInt(),
					ax=Math.abs(x-x1), ay=Math.abs(y-y1);
				if (x<x1 && ax>r || x>x1 && ax>l || y<y1 && ay>u || y>y1 && ay>d)
					out.println("NO");
				else
					out.println("YES "+(ax+ay));
			}
		} out.close();
	}
}

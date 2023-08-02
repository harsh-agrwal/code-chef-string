import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.*;

public class Main{
   
public static long gcd(long a, long b) {
      return b == 0 ? a : gcd(b, a % b); }
 public static long lcm(long u, long v)
    {
        return (u / gcd(u, v)) * v;
    }
 static final int mod=1_000_000_007;
 public static boolean areAllBitsSet(long n)
    {
        if (n == 0)
            return false;
        while (n > 0)
        {
            if ((n & 1) == 0)
                return false;
            n = n >> 1;
        }
            return true;
    }
    public static int Call(int[][] a,int n,int[] b,int j){
        int ans=0;
        for(int i=0;i<n;i++){
            b[a[i][j]]++;
            if(b[a[i][j]]==n-1){
                return a[i][j];
            }  
        }
        return 0;
    }
     public static int binarySearch(long[] a, long x)
    {
        int l = 0, r = a.length- 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == x)
                return m;
            if (a[m]< x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static long powerN(long number, long power) {
    long res = 1;
    long sq = number;
    while (power > 0) {
        if (power % 2 == 1) {
            res *= sq;
        }
        sq = sq * sq;
        power /= 2;
    }
    return res;
}
public static long powerOptimised(long a, long n)
{
    long ans = 1;
    while (n > 0)
    {
        long last_bit = (n & 1);
        if (last_bit > 0)
        {
            ans = ans * a;
        }
        a = a * a;
        n = n >> 1;
    }
    return ans;
}
public static boolean isPrime(int n) {
    if(n <= 1) {
        return false;
    }
    for(int i = 2; i <= Math.sqrt(n); i++) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}
 public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		PrintWriter out=new PrintWriter(System.out);
		Scanner sc=new Scanner(System.in);
     int T=fs.nextInt();
		for (int tt=1; tt<=T; tt++) {
	    char[] a=fs.next().toCharArray();
	    int n=a.length;
	    int[] b=new int[26];
	    for(int i=0;i<n;i++){
	        b[a[i]-'a']++;
	    }
	    int cnt=0;
	    boolean ok=false;
	    ArrayList<Integer> og=new ArrayList<>();
	    HashMap<Character,ArrayList<Integer>> map=new HashMap<Character,ArrayList<Integer>>();
	    for(int i=0;i<n;i++){
	        if(map.containsKey(a[i])){
	            ArrayList<Integer> mg=map.get(a[i]);
	            mg.add(i+1);
	            map.put(a[i],mg);
	        }
	        else{
	            ArrayList<Integer> mg=new ArrayList<>();
	            mg.add(i+1);
	            map.put(a[i],mg);
	        }
	    }
	    if(n%2==1){
	        for(int i=0;i<26;i++){
	            if(b[i]%2==1){
	                cnt++;
	            }
	        }
	        if(cnt>1){
	            out.println("-1");
	            ok=true;
	        }
	        else{
	            for(int i=0;i<26;i++){
	                if(b[i]%2==0 && b[i]>0){
	                   for(int j=0;j<map.get((char)(i+97)).size()/2;j++){
	                       og.add(map.get((char)(i+97)).get(j));
	                   }
	                }
	            }
	            for(int i=0;i<26;i++){
	                if(b[i]%2==1){
	                   for(int j=0;j<map.get((char)(i+97)).size();j++){
	                       og.add(map.get((char)(i+97)).get(j));
	                   }
	                }
	            }
	            for(int i=25;i>=0;i--){
	                if(b[i]%2==0 && b[i]>0){
	                   for(int j=map.get((char)(i+97)).size()/2;j<map.get((char)(i+97)).size();j++){
	                       og.add(map.get((char)(i+97)).get(j));
	                   }
	                }
	            }
	            
	        }
	    }
	    else{
	         for(int i=0;i<26;i++){
	            if(b[i]%2==1){
	                cnt++;
	            }
	        }
	        if(cnt>0){
	            out.println("-1");
	            ok=true;
	        }
	          for(int i=0;i<26;i++){
	                if(b[i]%2==0 && b[i]>0){
	                   for(int j=0;j<map.get((char)(i+97)).size()/2;j++){
	                       og.add(map.get((char)(i+97)).get(j));
	                   }
	                }
	            }
	              for(int i=25;i>=0;i--){
	                if(b[i]%2==0 && b[i]>0){
	                   for(int j=map.get((char)(i+97)).size()/2;j<map.get((char)(i+97)).size();j++){
	                       og.add(map.get((char)(i+97)).get(j));
	                   }
	                }
	            }
	    }
	    if(!ok){
	        for(Integer It:og){
	            out.print(It+" ");
	        }
	        out.println();
	    }
		}
		out.close();
		 
	}
public static long Ok(int n,int r){
    double sum=0;
     for(int i = 1; i <= r; i++){
            sum = sum * (n - r + i) / i;
        }
        return (long)sum;
}
	static int[] match(int[] a, int[] b) {
		int[] res=new int[a.length];
		for (int i=0; i<a.length; i++) res[i]=o(a[i], b[i]);
		return res;
	}
	static long toL(int[] a) {
		long ans=0;
		for (int i:a) ans=ans*3+i;
		return ans;
	}
	static int o(int a, int b) {
		if (a==b) return a;
		return a^b^3;
	}

	static final Random random=new Random();
	
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		
		Arrays.sort(a);
	} 
	}
	static long add(long a, long b) {
		return (a+b)%mod;
	}
	static long sub(long a, long b) {
		return ((a-b)%mod+mod)%mod;
	}
	static long mul(long a, long b) {
		return (a*b)%mod;
	}
	static long exp(long base, long exp) {
		if (exp==0) return 1;
		long half=exp(base, exp/2);
		if (exp%2==0) return mul(half, half);
		return mul(half, mul(half, base));
	}
	static long[] factorials=new long[2_000_001];
	static long[] invFactorials=new long[2_000_001];
	static void precompFacts() {
		factorials[0]=invFactorials[0]=1;
		for (int i=1; i<factorials.length; i++) factorials[i]=mul(factorials[i-1], i);
		invFactorials[factorials.length-1]=exp(factorials[factorials.length-1], mod-2);
		for (int i=invFactorials.length-2; i>=0; i--)
			invFactorials[i]=mul(invFactorials[i+1], i+1);
	}
	
	static long nCk(int n, int k) {
		return mul(factorials[n], mul(invFactorials[k], invFactorials[n-k]));
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}

	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	} 
}

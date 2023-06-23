import  java.io.*;
import java.util.*;
import  java.math.*;
import  java.lang.*;
class CodeChef
{
    public static ArrayList<Integer> getPrimes(int n) {
        boolean visited[] = new boolean[n + 1];
        Arrays.fill(visited, true);
        visited[0] = visited[1] = false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (visited[i]) {
                for (int j = i * i; j * j <= n; j++) {
                    visited[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (visited[i])
                list.add(i);
        }
        return list;
    }

    static long mod = 1000_000_007;

    public static long myPow(long x, int n) {
        if (n == 0 || x == 1.0)
            return 1l % mod;
        else if (n % 2 == 1) {
            return myPow(x * x, n / 2) % mod * x % mod;
        }
        return myPow(x * x, n / 2) % mod;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            String temp[]=br.readLine().split(" ");
            int n=Integer.parseInt(temp[0]);
            int k=Integer.parseInt(temp[1]);
            String s=br.readLine();
            int i=0,j=n-1;
            int count=0;
            while(i<j)
            {
                if(s.charAt(i)!=s.charAt(j))
                    count++;
                i++;
                j--;
            }
            if(n%2==1)
            {
                if(count<=k)
                System.out.println("YES");
                else
                System.out.println("NO");
            }
            else
            {
                k-=count;
                if(k%2==0 && k>=0)
                {
                    System.out.println("YES");
                }
                else
                System.out.println("NO");
            }
        }
    }
}

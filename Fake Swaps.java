import java.io.*;
import java.security.KeyPair;
import java.util.*;
import java.lang.*;
import java.math.*;
 class Main
{
    static long mod = (long)(1e9+7);
    static int minInt = Integer.MIN_VALUE;
    static int maxInt = Integer.MAX_VALUE;
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
        char nextChar(){
            return next().charAt(0);
        }
        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
     static String rev(String s){
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        str+=s.charAt(i);
        return str;
    }
    static boolean ispalin(String s){
        if(s.equals(rev(s)))
        return true;
        else
        return false;
    }
    static void swap(int a,int b){
        int tmp=a;
        a=b;
        b=tmp;
    }
    static int index(String A[],String s){
        int c=0;
        for(int i=0;i<A.length;i++){
            if(A[i].equals(s))
            return i;
            c=1;
        }
        return -1;
    }
    static long power(long a, long b) 
    {
        long res=1;
        while(b>0)
        {
            if(b%2==0) {a=(a*a)%mod;b/=2;}
            else {res=(res*a)%mod;b--;}
        }
        return res;
    }
    static void subsets(String s,int n,ArrayList<Character> ds){
        if(n==s.length())
        System.out.print(ds+" ");
        else{
            ds.add(s.charAt(n));
            subsets(s,n+1,ds);
            ds.remove(ds.size()-1);
            subsets(s,n+1,ds);
        }
        return;
    }
    static void subsets1(int A[],int n,ArrayList<Integer> ds){
        if(n==A.length)
        System.out.print(ds+" ");
        else{
            ds.add(A[n]);
            subsets1(A,n+1,ds);
            ds.remove(ds.size()-1);
            subsets1(A,n+1,ds);
        }
        return;
    }
   
    static int  maxfreq(int A[],int N){
        Arrays.sort(A);
         int max = 0, c = 1;
		        for(int j = 0; j < N-1; j++){
		            if(A[j] == A[j+1]){
		                c++;
		            }else{
		                max = Math.max(max, c);
		                c = 1;
		            }
		        }
		        max = Math.max(max, c);
		        return max;
    }

    static long gcd(long a, long b) { 
        if (b == 0) return a;
        return gcd(b, a % b);
    }
     static long lcm(long a, long b) { 
        return (a / gcd(a, b)) * b;
    } 
    static int searchlower(int a[], long b)   
    {
        int start = 0, end = a.length-1,f=-1;
        while (start <= end)
        {
            int mid = start + ((end - start) / 2);
            if (a[mid] == b) {f=mid;start=mid+1;}
            else if (a[mid] > b) end = mid - 1;
            else if (a[mid] < b) {f=mid;start = mid + 1;}
        }
        return f;
    }
    static int searchhigher(long a[], long b)   
    {
        int start = 0, end = a.length-1,f=-1;
        while (start <= end)
        {
            int mid = start + ((end - start) / 2);
            if (a[mid] == b) return mid;
            else if (a[mid] > b) {f=mid;end = mid - 1;}
            else if (a[mid] < b) start = mid + 1;
        }
        return f;
    }
    static int search(long a[], long b)   
    {
        int start = 0, end = a.length - 1;
        while (start <= end)
        {
            int mid = start + ((end - start) / 2);
            if (a[mid] == b) return mid;
            else if (a[mid] > b) end = mid - 1;
            else if (a[mid] < b) start = mid + 1;
        }
        return -1;
    }
    static int[] sortArray(int[] a) 
    {
        final Random random = new Random();
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            int oi = random.nextInt(n), temp = (int) a[oi];
            a[oi] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
        return a;
    }
    static void sortbyColumn(int arr[][], int col)
    {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col]));
    }
    static boolean[] prime(int n) 
    {
        boolean primecheck[] = new boolean[n+1];
        Arrays.fill(primecheck, true);
        primecheck[0] = false;
        primecheck[1] = false;
        for (int i=2;i*i<n+1;i++)
        {
            if (primecheck[i])
            {
                for (int j=i*2;j<n+1;j+=i) primecheck[j] = false;
            }
        }
        return primecheck;
    }
    static int[] factor(int n) 
    {
        int prime[] = new int[n+1];
        for (int i=2;i<n+1;i++)
        {
            if (prime[i]==0)
            {
                for (int j=i;j<n+1;j+=i)
                {
                    if(prime[j]==0) prime[j]=i;
                }
            }
        }
        return prime;
    }
   
    static long sqrt(long a) 
    {
        long s=1,e=1000000000;
        while(s<=e){
            long mid = s+((e-s)/2);
            if((mid*mid)==a) return mid;
            else if((mid*mid)<a) s=mid+1;
            else e=mid-1;
        }
        return e;
    }
    static  int bintodec(int a){
        int s=0;
        int j=0;
        for(int i=a;i>0;i=i/10){
            s+=(i%10*Math.pow(2,j));
            j+=1;
        }
        return s;
    }
    static int count(int A[],int x){
        int c=0;
        for(int i=0;i<A.length;i++){
            if(x==A[i])
            c+=1;
        }
        return c;
    }
    static void matmultiplication(long identity[][],long mat[][]) 
    {
        int n=mat.length;
        long temp[][] = new long[n][n];
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                for(int l=0;l<n;l++){
                    temp[j][k]+=mat[j][l]*identity[l][k];
                }
            }
        }
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++) identity[j][k]=temp[j][k];
        }
    }
    static int sum(int s){
        int su=0;
        for(int i=s;i>0;i=i/10){
            int j=i%10;
            su+=j;
        }
        return su;
    }
    static long[][] matrixpower(long mat[][],long power) 
    {
        long ans[][] = new long[mat.length][mat.length];
        for(int j=0;j<mat.length;j++) ans[j][j]=1;
        while(power>0){
            if(power%2==0) {
                matmultiplication(mat,mat);
                power/=2;
            }
            else {
                matmultiplication(ans,mat);
                power--;
            }
        }
        return ans;
    }
    static int digit(long a){
        int c=0;
        for(long i=a;i>0;i=i/10)
c+=1;
        return c;
    }
    static void graph(LinkedList<Integer> node[],int n,int m,FastReader sc) 
    {
        for(int j=0;j<=n;j++)
            node[j]=new LinkedList<>();
        for(int j=0;j<m;j++){
            int t1 = sc.nextInt(),t2 = sc.nextInt();
            node[t1].add(t2);
            node[t2].add(t1);
        }
    }
    static void dijkstra(LinkedList<Pair2> node[],long distance[],long visited[],Pair2 backtrack[]) 
    {
        distance[1]=0;
        backtrack[1]=new Pair2(1,0);
        PriorityQueue<Pair2> q = new PriorityQueue<>(new comparingLong());
        q.add(new Pair2(0,1));
        while(!q.isEmpty())
        {
            long t1 = q.peek().a/2,t2 = q.peek().b;
            q.remove();
            if(visited[(int)t2]==1) continue;
            visited[(int)t2]=1;
            for(Pair2 e:node[(int)t2])
            {
                if(distance[(int)e.a]>(t1+e.b)){
                    distance[(int)e.a]=t1+e.b;
                    backtrack[(int)e.a]=new Pair2(t2,e.b);
                    q.add(new Pair2(distance[(int)e.a],e.a));
                }
            }
        }
    }
    static void dfs(LinkedList<Integer> node[],char c[],int index,int white[],int black[],int visited[]) //dfs algorithm
    {
        visited[index]=1;
        for(int e:node[index]){
            if(visited[e]==0){
                dfs(node,c,e,white,black,visited);
                white[index]+=white[e];
                black[index]+=black[e];
            }
        }
        if(c[index-1]=='W') white[index]++;
        else black[index]++;
    }
    static void disjoint_rankunion(int rank[],int parent[],int t1,int t2)
    {
        int parentt1 = disjoint_findparent(parent,t1),parentt2 = disjoint_findparent(parent,t2);
        int rankt1 = rank[parentt1],rankt2 = rank[parentt2];
        if(parentt1==parentt2) return;
        if(rankt1>rankt2) parent[parentt2] = parentt1;
        else if(rankt2>rankt1) parent[parentt1] = parentt2;
        else {parent[parentt2]=parentt1;rank[parentt1]++;}
    }
    static void disjoint_sizeunion(int size[],int parent[],int t1,int t2) 
    {
        int parentt1 = disjoint_findparent(parent,t1),parentt2 = disjoint_findparent(parent,t2);
        int sizet1 = size[parentt1],sizet2 = size[parentt2];
        if(parentt1==parentt2) return;
        if(sizet1>=sizet2) {parent[parentt2] = parentt1;size[parentt1]+=size[parentt2];}
        else if(sizet2>sizet1) {parent[parentt1] = parentt2;size[parentt2]+=size[parentt1];}
    }
    static int disjoint_findparent(int parent[],int t1) 
    {
        if(parent[t1]==t1) return t1;
        else parent[t1] = disjoint_findparent(parent,parent[t1]);
        return parent[t1];
    }

    static void flowd_marshal(long distace[][]) 
    {
        for(int j=1;j<distace.length;j++){
            for(int k=1;k<distace.length;k++){
                for(int l=1;l<distace.length;l++){
                    long temp = distace[k][j]+distace[j][l];
                    if(distace[k][l]>temp) distace[k][l]=temp;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        FastReader sc = new FastReader();
        int t = sc.nextInt();
     while(t-->0)
        {
int n=sc.nextInt();
String s1=sc.next();
String s2=sc.next();
int o=0;
int z=0;
if((s2.indexOf('0')>=0 && s2.indexOf('1')>=0)||(s1.equals(s2)))
System.out.println("YES");
else
System.out.println("NO");
      
}
}
}
class Pair
{

    int a,b,c;
    Pair(int a1,int b1,int c1)
    {
        this.a=a1;
        this.b=b1;
        this.c=c1;
    }
}
class Pair1
{
    int a,b;
    Pair1(int a1,int b1)
    {
        this.a=a1;
        this.b=b1;
    }
}
class Pair2
{
    long a,b;
    Pair2(long a1,long b1)
    {
        this.a=a1;
        this.b=b1;
    }
}
class Pair3
{
    String a;
    int b;
    Pair3(String a1,int b1)
    {
        this.a=a1;
        this.b=b1;
    }
}
class comparingLong implements Comparator<Pair2>{
    public int compare(Pair2 s1, Pair2 s2){
        if (s1.a < s2.a)
            return -1;
        else if (s1.a > s2.a)
            return 1;
        return 0;
    }
}

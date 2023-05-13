import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final FastScanner fs = new FastScanner();
    static final PrintWriter ps = new PrintWriter(System.out);

    static void solver() {
        String tester = fs.next();
        int counter = 0;
        char[] set = tester.toCharArray();
        Arrays.sort(set);
        int i = 1;
        for (char x : set) {
            int s = (int) x;
            counter += (s - 96) * i;
            i++;
        }
        ps.println(counter);
        return;
    }

    public static void main(String[] args) throws IOException {
        int tc = 1;
        tc = fs.ni();
        // while (tc-- > 0)ps.println(solver());
        while (tc-- > 0) solver();
        ps.close();
        ps.flush();
        System.exit(0);
    }

    static int arsum(ArrayList<Integer> data) {
        int sum = 0;
        for (int z : data)
            sum += z;
        return sum;
    }

    static class FastScanner {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        ArrayList<Integer> nals(int len) {
            ArrayList<Integer> res = new ArrayList<Integer>();
            for (int i = 0; i < len; i++)
                res.add(ni());
            return res;
        }

        int ni() {
            return Integer.parseInt(next());
        }

        int[] nis(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = ni();
            return a;
        }

        long nl() {
            return Long.parseLong(next());
        }
    }
}

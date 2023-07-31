import java.util.Scanner;

class RMNTREV {	
	public static void charPrintArray(char[] a) {
		for(int i = 0; i < a.length; i++) System.out.print(a[i]);
		System.out.println();
	}
	
	public static void solve(Scanner sc) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] c = sc.next().toCharArray();
		//charPrintArray(c);
		char[] c2 = new char[K];
		int i2 = 0;
		for(int i = 0; i < K / 2; i++) {
			c2[i2++] = c[i];
			c2[i2++] = c[K - 1 - i];
		}
		if(K % 2 == 1) c2[i2] = c[K / 2];
		//charPrintArray(c2);
		for(int i = 0; i < K; i++) c[i] = c2[K - 1 - i];
		//charPrintArray(c);
		System.out.println(new String(c));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) solve(sc);
	}
}

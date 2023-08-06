/* package codechef; // don't place package name! */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	private static final int MAX_ROWS = 151;
	private static final int MAX_K = 501;
	int n, l, k;
	String [] list;
	int [][] dp;
	int [][] dpPath;
	int[][] pairedCosts;
	public Main(){
		this.pairedCosts = new int[MAX_ROWS][MAX_ROWS];
		this.dp = new int[MAX_ROWS][MAX_K];
		this.dpPath = new int[MAX_ROWS][MAX_K];
	}
	public void clearMain(){
		for(int i = 0; i < MAX_ROWS; i++){
			Arrays.fill(dp[i], 0);
			Arrays.fill(dpPath[i], 0);
			Arrays.fill(pairedCosts[i], 0);
		}
	}
	public void setList(int n, int l, int k, String [] list){
		this.n = n;
		this.l = l;
		this.k = k;
		this.list = list;
	}
	public boolean isSubString(int startPos, String first, String second){
		for(int i = 0, j = startPos; j < first.length(); j++, i++){
			if(first.charAt(j) != second.charAt(i)) return false;
		}
		return true;
	}
	public int getCost(int pos1, int pos2){
		char ch = list[pos1].charAt(0);
		int first = list[pos2].indexOf(ch,1);
		while(first != -1){
			if(isSubString(first,list[pos2], list[pos1])){
				return first;
			}
			first = list[pos2].indexOf(ch, first+1);
		}
		return l;
	}
	public void setPairedCosts(){
		int [] dpRowMinCosts = new int[n];
		for(int i = 0; i < n; i++){
			int min = 0;
			for(int j = 0; j < n; j++){
				pairedCosts[i][j] = getCost(i,j);
				if(pairedCosts[i][j] < pairedCosts[i][min]){
					min = j;
				}
			}
			dpRowMinCosts[i] = min;
		}
		for(int i = 0; i < dpRowMinCosts.length; i++){
			dpPath[i][1] = i;
			if(this.k >= 2){
				dp[i][2] = pairedCosts[i][dpRowMinCosts[i]];
				dpPath[i][2] = dpRowMinCosts[i];
			}
		}
	}
	public void solve(){
		setPairedCosts();
		for(int i = 2; i < k; i++){
			for(int j = 0; j < n; j++){
				int dpVal = dp[j][i];
				for(int a = 0; a < n; a++){
					int nextVal = dpVal + pairedCosts[a][j];
					if(dp[a][i+1] == 0 || dp[a][i+1] > nextVal){
						dp[a][i+1] = nextVal;
						dpPath[a][i+1] = j;
					}
				}
			}
		}
	}
	public String toString(){
		int minPos = 0;
		for(int i = 1; i < n; i++){
			if(dp[i][this.k] < dp[minPos][k]){
				minPos = i;
			}
		}
		int [] stringPos = new int[this.k+1];
		int [] stringPath = new int[this.k+1];
		int kPos = this.k;
		int start = minPos;
		while(kPos > 0){
			stringPos[kPos] = start;
			stringPath[kPos] = dp[start][kPos];
			start = dpPath[start][kPos];
			kPos--;
		}
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for(int i = 1; i < this.k; i++){
			sb1.append(list[stringPos[i]].substring(0,stringPath[i+1] - stringPath[i]));
			sb.append(stringPos[i] + " " + stringPath[i] + "\n");
		}
		sb1.append(list[stringPos[k]] + "\n");
		sb.append(stringPos[k] + " " + stringPath[k]);
		return (dp[minPos][k] + l) + "\n" + sb1.toString() + sb.toString();		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		Main main = new Main();
		int T = Integer.valueOf(reader.readLine());
		int n, l, k;
		String [] spl;
		for(int i = 0; i < T; i++){
			reader.readLine();
			spl = reader.readLine().trim().split("\\s+");
			n = Integer.valueOf(spl[0]);
			l = Integer.valueOf(spl[1]);
			k = Integer.valueOf(spl[2]);
			String [] list = new String[n];
			for(int j = 0; j < n; j++){
				list[j] = reader.readLine();
			}
			main.clearMain();
			main.setList(n, l, k, list);
			main.solve();
			writer.println(main);
			writer.println();
		}
		writer.flush();
	}
}

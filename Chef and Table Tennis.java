/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int chefScore = 0, opponentScore = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    opponentScore++;
                } else {
                    chefScore++;
                }
                if ((chefScore >= 11 || opponentScore >= 11) && Math.abs(chefScore - opponentScore) >= 2) {
                    break;
                }
            }
            if (chefScore > opponentScore) {
                System.out.println("WIN");
            } else {
                System.out.println("LOSE");
            }
        }
		// your code goes here
	}
}

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
        String known = sc.nextLine();
        int n = sc.nextInt();
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < known.length(); i++) {
            set.add(known.charAt(i));
        }
        sc.nextLine(); // to move to the next line
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            boolean canRead = true;
            for (int j = 0; j < word.length(); j++) {
                if (!set.contains(word.charAt(j))) {
                    canRead = false;
                    break;
                }
            }
            System.out.println(canRead ? "Yes" : "No");
        }
        sc.close();
		// your code goes here
	}
}

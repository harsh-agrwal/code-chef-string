/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < r; i++) {
            int l = scanner.nextInt();
            scanner.nextLine();
            String report = scanner.nextLine();
            boolean isValid = true;
            int count = 0;
            for (int j = 0; j < l; j++) {
                char c = report.charAt(j);
                if (c == 'H') {
                    if (count > 0) {
                        isValid = false;
                        break;
                    }
                    count++;
                } 
                else if (c == 'T') {
                    if (count == 0) {
                        isValid = false;
                        break;
                    }
                    count--;
                }
            }
            if (count > 0) {
                isValid = false;
            }
            System.out.println(isValid ? "Valid" : "Invalid");
        }
        scanner.close();
		// your code goes here
	}
}

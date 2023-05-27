/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Solution sol=new Solution();
		sol.output();
	}
}

class Solution {
    private Scanner sc = new Scanner(System.in);

    void output() {
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int totalBuildings = sc.nextInt();
            String buildings = sc.next();
            int savedBuildings = 0;
            if (totalBuildings == 1) {
                if (buildings.charAt(0) == '0') {
                    savedBuildings++;
                }
            } else {
                char[] arrOfBuildings = buildings.toCharArray();
                for (int i = 0, j = i - 2; i < arrOfBuildings.length - 1; i++) {
                    if (arrOfBuildings[i] == '1') {
                        j = i;
                    } else if (arrOfBuildings[i + 1] == '0' && j != i - 1) {
                        savedBuildings++;
                    }
                }

                int lastIndex = arrOfBuildings.length - 1;
                if (arrOfBuildings[lastIndex] == '0' && arrOfBuildings[lastIndex - 1] == '0') {
                    savedBuildings++;
                }
            }
            System.out.println(savedBuildings);
        }
    }
}

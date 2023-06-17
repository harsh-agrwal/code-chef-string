/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int n = sc.nextInt();
		    if(n > 0){
		        String teamA = sc.next();
		        String teamB = "";
		        int countA = 1, countB = 0;
		        
		        for(int i = 1; i < n; i++){
		            String temp = sc.next();
		            if(temp.equals(teamA))
		                countA++;
		            
		            else{
		                if(countB == 0){
		                    teamB = temp;
		                }
		                countB++;
		            }
		        }
		        if(countA > countB)
		            System.out.println(teamA);
		        else if(countB > countA)
		            System.out.println(teamB);
		        else
		            System.out.println("Draw");
		            
		    }
		    else{
		        System.out.println("Draw");
		    }
		    
		    
		    
		    T--;
		}
	}
}

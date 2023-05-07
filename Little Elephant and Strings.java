/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String arr[]=new String [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        while(k-->0){
            String p=sc.next();
           
            if(p.length()>=47){
                System.out.println("Good");
            }
            else{
                int flag=0;
                for(int j=0;j<n;j++){
                    if(p.contains(String.valueOf(arr[j]))){
                    flag=1;
                     }
                }
                if(flag==1){
                    System.out.println("Good");
                }
                else{
                System.out.println("Bad");
                }
                
            }
        
        }
	}
}

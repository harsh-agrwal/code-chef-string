/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	private static Set<Character> vowels=new HashSet<>();
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String S=sc.next();
            String P=sc.next();
            System.out.println(determineMinMoves(S,P,n));
        }
    }
    public static int determineMinMoves(String S,String P,int n){
        char[] SArr=S.toCharArray();
        char[] PArr=P.toCharArray();
        int[] freq=new int[26];
        for(int i=0;i<n;i++)
        {
            if(SArr[i]=='?' && PArr[i]!='?')
                freq[PArr[i]-97]+=1;
            if(PArr[i]=='?' && SArr[i]!='?')
                freq[SArr[i]-97]+=1;
        }
        int minAns=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<26;i++){
           ans=calculateMoves(S,P,(char)(i+97),n);
            minAns=Math.min(minAns,ans);
         }
        return minAns;  
    }
    public static int calculateMoves(String S,String P,char c,int n){
        char[] SArr=S.toCharArray();
        char[] PArr=P.toCharArray();
        int moves=0;
        for(int i=0;i<n;i++){
            if(SArr[i]=='?')
                SArr[i]=c;
            if(PArr[i]=='?')
                PArr[i]=c;
        }
        for(int i=0;i<n;i++){
            if(SArr[i]==PArr[i])  continue;
            else if((isVowel(SArr[i]) && isVowel(PArr[i])) || (!isVowel(SArr[i]) && !isVowel(PArr[i])))
                 moves+=2;
            else 
                moves+=1;
        }
        return moves;
    }
    public static boolean isVowel(Character c)
    {
        if(vowels.contains(c))
            return true;
        return false;
	}
}

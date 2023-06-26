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
	 Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  String ss=sc.nextLine();
  while(t-->0){
      String s=sc.nextLine();
      int n=s.length();
      boolean a=false;
      boolean A=false;
      boolean Num=false;
      boolean ash=false;
      for(int i=0;i<n;i++){
          char ch=s.charAt(i);
          if(ch>='a'&& ch<='z' ){
              
              if(!a)
              a=true;
              
          }else if (ch>='A'&& ch<='Z' && (i!=0 &&i!=n-1)){
              if(!A)
              A=true;
          }else if(ch>='0'&& ch<='9' && (i!=0 &&i!=n-1) ){
              if(!Num)
              Num=true;
            
          }else if((ch=='@'|| ch=='#'||ch=='%'|| ch=='&'||ch=='?') && (i!=0 &&i!=n-1)){
              if(!ash)
              ash=true;
              
          }
      }
      if(a && A && Num && ash && n>=10){
          System.out.println("YES");
      }else{
          System.out.println("NO");
      }
  }
	}
}

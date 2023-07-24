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
		
		int t = sc.nextInt();
		
		while( t-- > 0 ){
		    int n = sc.nextInt();
		    String s = sc.next();
		    
		    int count = 1;
		    
		    int max = 0;
		    
		  //  To store the string and it's count
		    HashMap<String,Integer> map = new HashMap<>();
		    
		    StringBuilder temp = new StringBuilder();
		    
		    for( int i = 0 ; i < n - 1 ; i++ ){
		        
		        
		        if( s.charAt(i) == s.charAt(i+1) ){
		            //If character are same then add to temp string.
		            temp.append( String.valueOf( s.charAt(i) ) );
		            count++;
		            
		        }
		        else{
		            
		            temp.append( String.valueOf( s.charAt(i) ) );
		            
		            map.put( temp.toString() , map.getOrDefault( temp.toString() , 0 ) + 1 );
		            
		            max = Math.max( max , count );
		            
		            count = 1;
		            
		            temp = new StringBuilder();
		        }
		        if(  i == n - 2 ){
		            
		            temp.append( String.valueOf( s.charAt(i+1) ) );
		            
		            map.put( temp.toString() , map.getOrDefault( temp.toString() , 0 ) + 1 );
		            
		            max = Math.max( max , count );
		        }
		    }
		    
		    int maxVal = 0;
		    
		    for( String key : map.keySet() ){
		        maxVal = Math.max( maxVal , key.length() );
		    }
		    
		    String ans = "";
		    
		    for( String key : map.keySet() ){
		        if( map.get(key) > 1 && key.length() == maxVal){
		            ans = key;
		        }
		    }
		    
		    if( ans.length() == max ){
		        System.out.println( max );
		    }
		    else{
		        System.out.println( (int)Math.max(ans.length() , max) - 1 );
		    }
		}
	}
}

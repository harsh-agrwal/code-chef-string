import java.io.*;
import java.util.*;

class Test {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext())
        System.out.println(winner(scanner.nextLine()));
    }
    public static String winner(String one){
      int a = 0, b = 0,x = 5,y = 5;
      for(int i=0;i<10;i++){
        char ch = one.charAt(i);
        if (i % 2 == 0) {
          if(ch=='1') a++;
          x--;
        } else {
          if(ch=='1') b++;
          y--;
        }
        if(a > b+y) return "TEAM-A "+(i+1);
        else if(b > a+x) return "TEAM-B "+(i+1);
      }
      if(a>b) return "TEAM-A "+(10);
      else if(b>a) return "TEAM-B "+(10);
      else{
        for(int i=10;i<20;i+=2){
          int j = i+1;
          if(one.charAt(i)!=one.charAt(j)) {
          if(one.charAt(i)=='1') return"TEAM-A "+(j+1);
          else  return"TEAM-B "+(j+1);
        }
      }
    }
    return "TIE";
    }
}

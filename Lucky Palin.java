import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t= Integer.parseInt(br.readLine());
        String s;
        
        while(t-->0)
        {
            s = br.readLine();
            if(s.length()<9)
            {
                System.out.println("unlucky");
            }
            else
            {
            int score=10000;
            String ans="";           
            for(int i=0;i<s.length()-4;i++)
            {
                int tempScore = 0;
                char c[] = s.toCharArray();
                
                if(c[i]!='l'){  c[i]='l';tempScore++;    }                
                if(c[i+1]!='u'){  c[i+1]='u';tempScore++;    }                
                if(c[i+2]!='c'){  c[i+2]='c';tempScore++;    }                
                if(c[i+3]!='k'){  c[i+3]='k';tempScore++;    }                
                if(c[i+4]!='y'){  c[i+4]='y';tempScore++;    }                
          for(int j=0,k = s.length()-1;j<=k;j++,k--)
            {
                if(c[j]!=c[k])
                {
                    if(j>=i&&j<=i+4)
                    {
                        if(k>=i&&k<=i+4)
                        {
                            tempScore = 10000;
                            break;
                        }
                        else
                        {
                            c[k] = c[j];
                            tempScore++;
                        }
                    }
                    else if(k>=i&&k<=i+4)
                    {
                        if(j>=i&&j<=i+4)
                        {
                            tempScore = 10000;
                            break;
                        }
                        else
                        {
                            c[j] = c[k];
                            tempScore++;
                        }
                    }
                    else
                    {
                        char ch = (char)Math.min(c[j],c[k]);
                        c[j] = ch;
                        c[k] = ch;
                        tempScore++;
                    }
                }                
            }
            
            if(score>tempScore)
            {
                ans = new String(c);
                score = tempScore;
            }
            else if(score==tempScore)
            {
                if(ans.equals(""))
                    ans = new String(c);
                else
                {
                    if(ans.compareTo(new String(c))>0)
                        ans = new String(c);                    
                }
            }
        }
            System.out.println(ans+" "+score);
            }
        }
	}
}

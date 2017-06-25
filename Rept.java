import java.util.*;
class Rept
{
 public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,cou=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(a[0]==a[i])
            {
               cou++;
            }
        } 
        if(cou==0)
        {        
            System.out.println("NON repeated");
        }
     else
            System.out.println("repeated");
            }
           }

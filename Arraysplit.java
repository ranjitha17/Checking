import java.util.*;
class Arraysplit
{
 public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,sum=0,avg1,sum1=0,avg2;
        int n=s.nextInt();
        int d=n/2;
        int e=n-d;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
         a[i]=s.nextInt();   
        }
        for(i=0;i<d;i++)
        {
            sum=sum+a[i];
        }
        
        avg1=sum/d;
        for(i=d;i<n;i++)
        {
            sum1=sum1+a[i];
        }
        avg2=sum1/e;
       if(avg1==avg2)
        {  System.out.print("[");
           for(i=0;i<d;i++)
           {
               System.out.print(+a[i]+"," );
           }
           System.out.print("]");
           System.out.print("[");
           for(i=d;i<n;i++)
           {
               System.out.print(+a[i]+",");
            }
           System.out.print("]");
        }
        else
        {
            System.out.println("notpossible");
    }        
    
    
    }
}

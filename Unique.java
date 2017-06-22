import java.util.*;
class Unique
{
public static void main(String arg[])
Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=s.nextInt();
           c=c^a[i];
       }
           System.out.println(c);
       
       
    }
    
}

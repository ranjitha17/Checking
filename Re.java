import java.util.*;
class Re
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
          a[i]=s.nextInt();  
        }
        for(int i=0;i<l-1;i++)
        {
            if(a[i]>a[i+1])
            System.out.print(a[i+1]+" ");
            else
            System.out.print("-1 ");
        }
        
            System.out.print("-1");
            
    }
}

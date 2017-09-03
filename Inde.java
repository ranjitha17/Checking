import java.util.*;
public class Inde
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(a[i]==i)
            System.out.println("value:" +a[i]+"index:"+i );
        }
    }
}

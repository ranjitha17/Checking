import java.util.*;
class Revs
{
    public static void main(String arg[])
    {int i;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String S1[]=new String[n];
        for(i=0;i<n;i++)
        {
        S1[i]=s.next();
        }
        for(i=n-1;i>=0;i--)
        {
        System.out.print(" "+S1[i]);
          }
}
}

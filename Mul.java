import java.util.*;
class Mul
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int z=n;
        while(n!=0)
        {
            int r=n%10;
            z=z*r;
            n=n/10;
        }
        System.out.println(z);
    }
}

import java.util.*;
class Zooom
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String d[]=s.split(" ");
        int g=d.length;
        for(int i=0;i<g;i++)
        {
            if(i%2!=0)
            {
                StringBuffer br=new StringBuffer(d[i]);
                System.out.print(br.reverse() +" ");
            }
            else
            System.out.print(d[i] +" ");
        }
    }
}

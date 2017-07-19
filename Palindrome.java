import java.util.*;
class Palindrome
{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r=0;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        int y=sum;
        int p=0;
        while(sum>0)
        {
            int re=sum%10;
             p=p*10+re;
            sum=sum/10;
       }
        if(y==p)
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("not palindrome");
    }
    
}

import java.util.*;
class Multipledigit
{
public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int a=num;
        while(num!=0)
        {
            int last=num%10;
            a=a*last;
            num=num/10;
                    
        }
        System.out.println(a);
        }}

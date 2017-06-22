import java.util.*;
class Prefix
{
public static void main(String[] args) {
    
       Scanner sc=new Scanner(System.in);
int i,j,k;
String s1,s2,s3;
s1=sc.nextLine();
s2=sc.nextLine();
s3=sc.nextLine();
String res=" ";
char c1[]=s1.toCharArray();
char c2[]=s2.toCharArray();
char c3[]=s3.toCharArray();
for(i=0;i<c1.length;i++)
{
    for(j=0;j<c2.length;j++)
    {
        for(k=0;k<c3.length;k++)
        {
           if(c1[i]==c2[j]&&c1[i]==c3[k])
           {
             System.out.print(c1[i]);
             break;
           }
    }
}
}
}

package guvi;
import java.util.*;
public class Equalstr {
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char ch[]=s.toCharArray();
    int l=s.length();
    for(int i=0;i<l;i++)
    {
    	int j=i+1;
    	System.out.print(ch[i]);
    	if(ch[i]==ch[j])
    	{
    		System.out.print("*");
    	}
    }
    	
    }

}

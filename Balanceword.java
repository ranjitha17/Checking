package logicprogram;
import java.util.*;
public class Balanceword {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s.toLowerCase();
		char ch[]=s.toCharArray();
		int cou=0,cou1=0;
		for(int i=0;i<s.length();i++)
		{
		
		for(char k='a';k<='m';k++)
		{
			if(ch[i]==k)
			{
				cou+=1;
			}
		}
		}
		for(int i=0;i<s.length();i++)
		{
		
		for(char k='n';k<='z';k++)
		{
			if(ch[i]==k)
			{
				cou1+=1;
			}
		}
		}
		
		if(cou==cou1)
			{
			System.out.println(s+"   is balance");	
			}
			else if(cou!=cou1)
				System.out.println(s+"  is not balance");
			
	}
			
		}



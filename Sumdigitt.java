package logicprogram;

import java.util.Scanner;

public class Sumdigitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int sum=0;
		String s=Integer.toString(l);
		//char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				sum=sum+Character.getNumericValue(s.charAt(j));;
			}
		}
		System.out.print(sum);
		

	}

}

package logicprogram;
import java.util.*;
public class Guvi
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int l=50;
		int a[]=new int[l];
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[a.length-4]);
		int k=sc.nextInt();
		System.out.println(a[a.length-k]);
	}

}

package logicprogram;
import java.util.*;
public class ArraysTraget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		
		int a[]=new int[l];
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				int t=a[i]+a[j];
				if(t==target)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
		
	}

}

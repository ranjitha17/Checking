import java.util.*;
public class Stareprg {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sapce=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
			    
				System.out.print("*");
			}
			for(int k=0;k<=sapce;k++)
			System.out.print(" ");
			
			for(int j=1;j<=i;j++)
		{
		    
		    System.out.print("*");
		}
			System.out.print("\n");
			sapce+=1;
		}
		
	}

}

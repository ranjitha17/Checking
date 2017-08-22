import java.util.*;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int sum=0;
		int pow=0;
		String s=Integer.toString(d);
		int l=s.length();
		for(int j=0;j<l;j++)
		{
		for(int i=j;i<=j;i++)
		{
			
			pow=(int) Math.pow(Character.getNumericValue(s.charAt(j)), j);
		}
		sum=sum+(int)pow;

	}
		System.out.println(sum);

}
}

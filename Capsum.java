package logicprogram;
import java.util.*;
public class Capsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int sum=0,pow=1;
		String s=Integer.toString(d);
		int l=s.length();
		for(int j=0;j<l;j++)
		{pow=1;
		for(int i=0;i<l;i++)
		{
			pow=pow*Character.getNumericValue(s.charAt(j));
		}
		sum=sum+pow;

	}
		System.out.println(sum);

}
}

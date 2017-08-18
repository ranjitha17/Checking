package guvi;
import java.util.*;
public class num {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
	String x =sc.nextLine();
	x=x.replaceAll("\\s", "");
	
	int n=x.length();
	char[] ch = x.toCharArray();
	int letter = 0;
	int num = 0;
	for(int i = 0; i < x.length(); i++){
		if(Character.isLetter(ch[i])){
			letter ++ ;
		}
		else if(Character.isDigit(ch[i])){
			num ++ ;
		}
		
		}
	if(num==n)
	{
		System.out.println("true");
	}
	else
		System.out.println("false");
		
		}

}

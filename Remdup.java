import java.util.*;
class Remdup
{
public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ss=s.nextLine();
        char chars[]=ss.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
       for (char c : chars) {
      charSet.add(c);
      }
       StringBuilder sb = new StringBuilder();
for (Character character : charSet) {
    sb.append(character);
}
System.out.println(sb.toString());
}
}

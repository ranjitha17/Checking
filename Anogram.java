 import java.util.*;
 class Anogram
 {
 public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        s1.toLowerCase();
        s2.toLowerCase();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        Arrays.toString(c1);
        System.out.println(c1);
        if((Arrays.toString(c1).equals(Arrays.toString(c1))))
        {
            System.out.println("anogram");
    }
    else
        {
            System.out.println("not anogram");
}
    }
}

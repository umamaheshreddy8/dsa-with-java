//reverse the given string.
import java.util.*;
public class reversestring {
    public static String reverse(String x){
        String reverse_x="";
        for(int i=x.length()-1;i>=0;i--){
            reverse_x=reverse_x+x.charAt(i);
        }
        return reverse_x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to reverse:");
        String oi = sc.nextLine();
        System.out.println(reverse(oi));
    }
    
}

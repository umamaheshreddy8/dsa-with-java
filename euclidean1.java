//euclidean algorithm (recursive approach)
import java.util.*;
public class euclidean1 {
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a1:");
        int a1=sc.nextInt();
        System.out.println("enter the b1:");
        int b1=sc.nextInt();
        System.out.println(gcd(a1,b1));

    }
    
}

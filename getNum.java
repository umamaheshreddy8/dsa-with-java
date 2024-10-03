// to print the number of digits in the given number
import java.util.*;
public class getNum{
    public static int count_digits(int n){
        if(n==0){
            return 1;
        }
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n1:");
        int n1=sc.nextInt();
        System.out.println(count_digits(n1));
        
    }
}
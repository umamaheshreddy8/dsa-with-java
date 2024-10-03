// in karatsuba to multiplate 2 numbers we divide them into smaller parts and multiply ,
//if there are X,Y.X will be written as X=x1*10^n/2+x0, Y=y1*10^n/2+y0. and as it will be as (X*Y)=(x1*10^n/2+x0)*(y1*10^n/2+y0)
//THE product of them will be written in forms of z's, x0*y0=z1,x1*y1=z2,and z1=(x0y1+y0x1)=(x0+x1)*(y1+y0)-z1-z0.
import java.util.*;
public class karatsuba {
    public static int count_ndigits(int n){
        if(n==0){
            return 1;
        }
        int count=0;
        while(n<0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int karatsuba(int x1,int x2){
        if(x1<10||x2<10){
            return x1*x2;
        }
        int m=Math.max(count_ndigits(x2),count_ndigits(x1));
        int half_m=m/2;
        int power10=(int) Math.pow(10,half_m);
        // x1 is divided into parts a and b and x2 is divided into parts of c and d
        int a=x1/power10;
        int b=x1%power10;
        int c=x2/power10;
        int d=x2%power10;
        int ac=karatsuba(a,c); //z0
        int bd=karatsuba(b,d); //z2
        int abcd=karatsuba(a+b,c+d); //z1=(x1+x0)*(x2+x20)-z0-z1
        int result=ac*(int)Math.pow(10,2*half_m)+(abcd-ac-bd)*power10+bd;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n1:");
        int X=sc.nextInt();
        System.out.println("enter the Y:");
        int Y=sc.nextInt();
        System.out.println(count_ndigits(Y));

    }
    
}

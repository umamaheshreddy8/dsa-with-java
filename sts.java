/*chinese remainder theorem */
import java.io.*;
import java.util.*;
public class sts {
    static int findminX( int num[],int rem[],int k){
        int x=1;
        while(true){
            for(int j=0;j<k;k++){
                if(x%num[j]!=rem[j]){
                    break;
                }
                if(j==k){
                    return x;
                }
                x++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("size:");
        int size = sc.nextInt();
        int n[]= new int[size];
        int a[] = new int [size];
        System.out.println("enter the values of a;");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the values of n;");
        for(int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("x is "+findminX(n,a, size));
        
    }


    
}

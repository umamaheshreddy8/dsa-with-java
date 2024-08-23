/*EULER PHI function */
import java.io.*;
import java.util.*;
class sts5 {
    static int gcd(int a, int b) {
        if (a == 0) {
            return b; 
        }
        return gcd(b % a, a);
    }
    static int phi(int n) {
        int result = 0; 
        for (int i = 1; i < n; i++) {
            if (gcd(i, n) == 1) { 
                result++;
            }
        }
        return result; // Return the final result
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int N = sc.nextInt();
        System.out.println(phi(N));


       
    }
}

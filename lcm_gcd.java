//19th september 2024. on geeks for geeks
import java.util.*;
class lcm_gcd {
    static Long[] lcmAndGcd(Long A, Long B) {
        Long gcd = gcd(A, B);
        Long lcm = (A * B) / gcd;
        return new Long[]{lcm, gcd};
    }

    static Long gcd(Long A, Long B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B); // Recursive approach for Euclidean algorithm
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        Long A1 = sc.nextLong();
        System.out.println("Enter B:");
        Long B1 = sc.nextLong();

        Long[] result = lcmAndGcd(A1, B1);
        System.out.println("LCM: " + result[0]);
        System.out.println("GCD: " + result[1]);
    }
}

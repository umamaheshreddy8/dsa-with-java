/*stobogrammatic number */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sts6 {
    public static boolean isstobogrammatic(String num) {
        Map<Character, Character> dic = new HashMap<>();
        dic.put('0', '0');
        dic.put('1', '1');
        dic.put('8', '8');
        dic.put('6', '9');
        dic.put('9', '6');

        int n = num.length();
        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            char left_digit = num.charAt(i);
            char right_digit = num.charAt(j);
            char mapping = dic.getOrDefault(left_digit, '-');
            
            if (mapping == '-' || mapping != right_digit) {
                return false;
            }
        }
        return true;  // This should be outside the loop
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String n = sc.nextLine();
        System.out.println(isstobogrammatic(n));
    }
}

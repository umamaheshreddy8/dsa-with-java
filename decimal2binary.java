//code for converting the given decimal to binary =.
import java.util.*;
public class dsatry1{
      static String  convert2binary(int n){
        String res="";
        while(n>0){
            if(n%2==1){
                res=res+"1";
            }
            else{
                res=res+"0";
            }
            n=n/2;
        }
        StringBuilder reverseRes = new StringBuilder(res);
        reverseRes.reverse();
        return reverseRes.toString();

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n to convert the given decimal to binary");
        int n=sc.nextInt();
        System.out.println(convert2binary(n));
    
}
    }
            //you can get the doubt that why n1=n1/2 is written at the end of the loop,
            //why it is not written before the if conditions.
            // in convertion u have to take the remianders 0's and 1's,
            //if we take as ur doubt,
            // take an example, and take the  the n1=n1/2,
            //and write the if conditions after to it,example 48 first u divide it with 2,
            //then u get 24 (new n1) and 0 as remainder, u have to add that 0, in the "res"(binary form)
            //but u are not taking that 0,and writing if condition, and in that u are dividing the 24 by 2 ,
            //and then u are taking that 0, 24/2=12(new n1) and with reaminder 0,then loop contiues, 
            // again by n1=n1/2(in 12/2=6) with remainder 0, u are not taking this 0, and moving to if condition
            //and then u are doing (6/2=3 wiht remainder 0)
            // by doing as u thought in ur doubt, u were missing taking some remianders in binary form.
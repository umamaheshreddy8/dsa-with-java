/*sts-sieve of eratothenes - to print all the prime numbers till the given limit(N) */
import java.util.*;
public class sts3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the N:");
        int N = sc.nextInt();
        /*to take input limit (upto where he wants the prime numbers)from the user  */
        boolean bool[] = new boolean [N+1];/*to include N in the array we wrote the N+1,
        to mark the elements as true and false to differentiate within the primes(true) and composites for that i took boolean array,
        u can also mark them in 1's and 0's for that take integer array */
        for(int i=0;i<bool.length;i++){/*first i marked all the numbers as true in the array */
            bool[i]=true;
        }
        for(int i= 2;i<=Math.sqrt(N);i++){/*as the alogorithm simple sieve says " to remove the composites ,
        we need not take all the numbers from 1 to N and remove their composites individually,
         it is enough to take prinmes b/w( 2 to sqrt(N)) and remove their multiples to remove all the composties" */
            if(bool[i]==true){
                for(int j=i*i;j<N;j=j+i){
                    bool[j]=false;
                }
            }
        }/*now we marked the multiples of primes in 2 to sqrt(n) as false */
        System.out.println("the list of prime numbers upto N are:");
        for(int i=2;i<N;i++){
            if(bool[i]==true){
                System.out.println(i);
            }
        }/*as the primes are marked as true and composites are marked as false , 
        to print the primes,we wrote print theumbers which are marked as true in the array */

    }

}

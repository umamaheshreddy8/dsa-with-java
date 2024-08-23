/*segmented sieve*/

import java.util.*;
public  class sts4{
    static int N =10000;
    static boolean bool[] = new boolean [N+1];
    /*u need to mention the static for N and bool[]
     here to use them in the function */
    public static void simplesieve(){
        for(int i=0;i<=N;i++){
            bool[i]=true;
        }
        for(int i= 2;i<=Math.sqrt(N);i++){
            if(bool[i]==true){
                for(int j=i*i;j<N;j=j+i){
                    bool[j]=false;
                }
            }
        }
}
static ArrayList<Integer> generatePrimes(int n){
    ArrayList<Integer> al =new ArrayList();
    for(int i= 2;i<=Math.sqrt(n);i++){
        if(bool[i]==true){
            al.add(i);
        }
    }
    return al;
}
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int high = sc.nextInt();
    int low = sc.nextInt();
    int k= high-low;
    boolean dummy[] = new boolean[k+1];
    for(int i=0;i<=k;i++){
        dummy[i]=true;
    }


}
}


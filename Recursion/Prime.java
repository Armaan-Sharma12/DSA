
import java.util.Arrays;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);


    }
    public static boolean isPrime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void sieve(int n, boolean[] primes){
        for (int i = 2; i*i<=n ; i++) {
            if(!primes[i]){
                for (int j = i*i; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!primes[i]){
                System.out.print(i+ " ");
            }
        }
    }
}



import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The number is Prime : "+isPrime(n));
        System.out.println("The number is Armstrong : "+isArmstrong(n));
    }
    static boolean isPrime(int n) {
        if(n<=1) return false;
        int c =2;
        while(c*c<=n){
            if(n%c==0) return false;
            c++;
        }
        return c*c>n;
    }

    static boolean isArmstrong(int n){
        if(n<=1) return false;
        int sum = 0;
        int a =n;
        while(a>0){
            int rem = a%10;
            int cube = rem*rem*rem;
            sum += cube;
            a /= 10;
        }
        return sum == n;
    }
}

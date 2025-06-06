

public class printNumber {
    public static void main(String[] args) {
        int n=151;
        System.out.println(palindrome(n));
    }
    static int function(int n){
        if(n<=0){
            return 0;
        }
        System.out.println(n);
        return function(n-1);
    }
    static void functionReverse(int n){
        if(n>1){
            functionReverse(n-1);
        }
        System.out.println(n);

    }
    static long factorial(int n){
        if(n==0) return 1;
        return (long)n*factorial(n-1);
    }
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);

    }
    static int productOfDigits(int n){
        if(n==0) return 1;
        return (n%10)*productOfDigits(n/10);
    }
    static String reverseNumber(int n){
        if(n==0) return "";
        return (n%10)+""+reverseNumber(n/10);

    }
    static boolean palindrome(int n){
        if(n==Integer.parseInt(reverseNumber(n))) return true;
        return false;
    }
}

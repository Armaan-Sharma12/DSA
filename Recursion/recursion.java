
public class recursion{
    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long fiboFormula(long n){
        return (long)((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n)) / Math.sqrt(5));
    }
}

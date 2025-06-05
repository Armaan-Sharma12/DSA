

public class MagicNumber {
    public static void main(String[] args) {
        xorInRange(3,6);
    }
    public static int magic(int n,int base){
        int temp = base;
        int ans = 0;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base =base*temp;
        }
        return ans;
    }
    public static void numberOfDigits(int n,int base){
        int result = (int)(Math.log(n) / Math.log(base))+1;
        System.out.println(result);
    }
    public static void sumOfPascalTriangle(int n){
        int result = 1<<(n-1);
        System.out.println(result);
    }
    public static void powerOfTwo(int n){
        boolean ans = (n&(n-1))==0;
        System.out.println(ans);
    }
    public static void exponential(int base, int power){
        int ans = 1;
        while(power>0){
            if((power&1)==1) ans*=base;
            base *=base;
            power=power>>1;
        }
        System.out.println(ans);
    }
    public static void setBits(int n){
        int ans= 0;
        while(n>0){
            n=(n&(n-1));
            ans++;
        }
        System.out.println(ans);
    }
    public static int xorTillNumber(int n){
        if(n%4 ==0) return n;
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        return 0;
    }
    public static void xorInRange(int lb, int ub){
        System.out.println(xorTillNumber(ub)^xorTillNumber(lb-1));
    }
}

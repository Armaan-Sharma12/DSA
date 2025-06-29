
public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow!=fast);

        return slow==1;
    }
    public int findSquare(int n){
        int ans=0;
        if(n<10){
            return n*n;
        }
        while(n>0){
            int rem =  n%10;
            ans += rem*rem;
            n/=10;
        }
        return ans;
    }
}

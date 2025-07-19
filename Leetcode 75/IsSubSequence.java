
//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75
public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if(t.length()==0) return false;
        int index = 0;
        for(int i = 0 ; i < t.length() ; i++){
            if(s.charAt(index)==t.charAt(i)){
                index++;
                if(index==s.length()) return true;
            }
        }
        return false;
    }
}

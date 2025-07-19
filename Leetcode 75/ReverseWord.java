
//https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75
public class ReverseWord {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        if(arr.length==1) return arr[0];
        if(arr.length==0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >=0 ; i--) {
            String word = arr[i];
            if(word.isEmpty()) continue;
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(word);
        }
        return sb.toString();
    }
}

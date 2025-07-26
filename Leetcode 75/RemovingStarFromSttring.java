//https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75
import java.util.Stack;

public class RemovingStarFromSttring {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

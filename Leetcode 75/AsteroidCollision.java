
//https://leetcode.com/problems/asteroid-collision/?envType=study-plan-v2&envId=leetcode-75
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length<=1) return asteroids;
        Stack<Integer> stack = new Stack<>();
        for(int num : asteroids){
            if(num<0){
                while(!stack.isEmpty() && stack.peek()>0){
                    if(stack.peek()<Math.abs(num)){
                        stack.pop();
                    }
                    else if(stack.peek()==Math.abs(num)){
                        stack.pop();
                        num = 0;
                        break;
                    }
                    else{
                        num = 0;
                        break;
                    }
                }
                if(num != 0 && (stack.isEmpty() || stack.peek()<0)){
                    stack.push(num);
                }
            }
            else{
                stack.push(num);
            }
        }
        int []  result = new int[stack.size()];
        int index = 0 ;
        for(int num:stack){
            result[index++] = num;
        }
        return result;
    }
}

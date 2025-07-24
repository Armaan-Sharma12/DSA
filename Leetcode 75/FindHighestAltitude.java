
//https://leetcode.com/problems/find-the-highest-altitude?envType=study-plan-v2&envId=leetcode-75
public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] result = new int[gain.length+1];
        result[0]=0;

        for(int i =1; i<=gain.length;i++){
            result[i] = gain[i-1]+result[i-1];
        }

        int maxElement=0;
        for(int max : result){
            maxElement = Math.max(maxElement,max);
        }
        return maxElement;
    }
}

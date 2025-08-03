
import java.util.ArrayList;
//https://leetcode.com/problems/find-the-town-judge/?envType=problem-list-v2&envId=graph
public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n+1];
        for(int[] edge : trust){
            int trustingPerson = edge[0];
            int trustedPerson = edge[1];

            trustCount[trustingPerson]--;
            trustCount[trustedPerson]++;
        }
        for(int i = 1 ; i<= n ; i++){
            if(trustCount[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}

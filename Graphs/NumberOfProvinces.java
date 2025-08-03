//https://www.geeksforgeeks.org/problems/number-of-provinces/1
import java.util.ArrayList;

public class NumberOfProvinces {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for(int i = 0 ; i<V ; i++){
            adjLs.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            for (int j=0;j<V;j++) {
                if(adj.get(i).get(j)==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int [] vis = new int[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if(vis[i]==0){
                count++;
                dfs(i,adjLs,vis);
            }
        }
        return count;
    }
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int [] vis) {
        vis[node] = 1;
        for (int i : adjLs.get(node)) {
            if (vis[i] == 0) {
                dfs(i, adjLs, vis);
            }
        }
    }

    //https://leetcode.com/problems/number-of-provinces/description/
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int  i = 0 ; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int  i = 0 ; i<V; i++){
            for (int j = 0; j < V; j++) {
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int[]  vis = new int[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if(vis[i]==0){
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
}

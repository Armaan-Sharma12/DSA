

import java.util.ArrayList;

public class DfsGraph {
    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] vis = new boolean[v+1];
        vis[0] = true;
        dfs(0,adj,vis,result);
        return result;
    }
    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean [] vis,ArrayList<Integer> result){
        vis[node] = true;
        result.add(node);
        for(int i : adj.get(node)){
            if(!vis[i]){
                dfs(i,adj,vis,result);
            }
        }
    }
}

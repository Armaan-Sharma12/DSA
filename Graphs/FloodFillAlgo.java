//https://www.geeksforgeeks.org/problems/flood-fill-algorithm1856/1
//https://leetcode.com/problems/flood-fill/
public class FloodFillAlgo {
    private int n;
    private int m;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int initialColor = image[sr][sc];
        n=image.length;
        m=image[0].length;
        if(initialColor==newColor) return image;
        dfs(image,sr,sc,newColor,initialColor);
        image[sr][sc]=newColor;
        return image;
    }
    private void dfs(int[][] image , int i, int j,int newColor,int initialColor) {
        if(i<0 || j<0 || i>=n || j>=m || image[i][j]!=initialColor) return;
        image[i][j]= newColor;
        dfs(image,i+1,j,newColor,initialColor);
        dfs(image,i-1,j,newColor,initialColor);
        dfs(image,i,j+1,newColor,initialColor);
        dfs(image,i,j-1,newColor,initialColor);
    }
}

package com.Leetcode75;
//https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EqualRowAndColumnPair {
    public int equalPairs(int[][] grid) {
        HashMap<Integer, List<Integer>> map1 = new HashMap<>();
        //row hashmap
        for(int row = 0; row < grid.length ; row++){
            List<Integer> list = new ArrayList<>();
            for(int col = 0; col < grid[row].length ; col++){
                list.add(grid[row][col]);
            }
            map1.put(row, list);
        }
        //col hashmap
        HashMap<Integer, List<Integer>> map2 = new HashMap<>();
        for(int col = 0; col < grid.length ; col++){
            List<Integer> list = new ArrayList<>();
            for(int row = 0; row < grid.length ; row++){
                list.add(grid[row][col]);
            }
            map2.put(col, list);
        }
        int count = 0;
        for(List<Integer> list1 : map1.values()){
            for(List<Integer> list2 : map2.values()){
                if(list1.equals(list2)){
                    count++;
                }
            }
        }
        return count;
    }
}

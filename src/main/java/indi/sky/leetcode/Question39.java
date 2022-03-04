package indi.sky.leetcode;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. 组合总和
 */
public class Question39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, res, 0, new ArrayList<Integer>());
        return res;
    }

    /**
     * f(n) = f(n-1)+k
     */

//    void back(int[] nums,int target,List<List<Integer>> res,int start){
//        if (target<=0)return;
//        for (int i = 0; i < ; i++) {
//
//        }
//    }



    private void backtrack(int[] candidates, int target, List<List<Integer>> res, int start, List<Integer> list) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            int e = candidates[i];
            if (target < e) break;
            list.add(e);
            backtrack(candidates, target - e, res, i, list);
            list.remove(list.size() - 1);
        }
    }

    class Solution {
        List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            addElement(candidates, list, sum, target,0);
            return res;
        }

        private void addElement(int[] candidates, List<Integer> list, int sum, int target,int index) {
            if (sum > target)
                return;
            if (sum == target) {
                res.add(list);
                return;
            }
            for (int i = index; i < candidates.length; i++) {
                List<Integer> t_list = new ArrayList<>(list);
                t_list.add(candidates[i]);
                addElement(candidates, t_list, sum + candidates[i], target,i);
            }

        }
    }

}

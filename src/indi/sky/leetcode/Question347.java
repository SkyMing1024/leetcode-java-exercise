package indi.sky.leetcode;

import java.util.*;

/**
 * 347. 前K个高频元素
 */
public class Question347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<Integer>(k);
        if (k > nums.length) {
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            return list;
        }
        int[] res = new int[k];
        int[] freq = new int[k];
        int tmp = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (tmp < k) {
                res[tmp] = key;
                freq[tmp] = map.get(key);
                tmp++;
            } else {
                for (int j = 0; j < k ; j++) {
                    if (freq[j] <map.get(key)){
                        freq[j] = map.get(key);
                        res[j] = key;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            list.add(res[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        Question347 q = new Question347();
        int[] arr = {5,1,-1,-8,-7,8,-5,0,1,10,8,0,-4,3,-1,-1,4,-5,4,-3,0,2,2,2,4,-2,-4,8,-7,-7,2,-8,0,-8,10,8,-8,-2,-9,4,-7,6,6,-1,4,2,8,-3,5,-9,-3,6,-8,-5,5,10,2,-5,-1,-5,1,-3,7,0,8,-2,-3,-1,-5,4,7,-9,0,2,10,4,4,-4,-1,-1,6,-8,-9,-1,9,-9,3,5,1,6,-1,-2,4,2,4,-6,4,4,5,-5};
        List<Integer> list = q.topKFrequent(arr, 7);
    }
}

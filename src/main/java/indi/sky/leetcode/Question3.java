package indi.sky.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3.无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class Question3 {

    /**
     * 暴力破解:
     * 求出所有子串(两次循环),判断子串是否有重复字符(一次循环)
     * 缺点:
     * 时间复杂度太高O(n^3)
     */
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String subStr = s.substring(i,j);
                if (ifCharUnique(s,i,j)){
                    res = Math.max(res,j-i);
                }
            }
        }
        return res;
    }

    public boolean ifCharUnique(String str,int s, int e){
        Set<Character> set = new HashSet<>();
        for (int i = s; i < e; i++) {
            char character = str.charAt(i);
            if (set.contains(character)){
                return false;
            }else {
                set.add(character);
            }
        }
        return true;
    }

    public int lengthOfLongestSubstring2(String s) {
        int[] m = new int[128];
        int len = 0;
        for(int i = 0, j = 0; j < s.length(); j++){
            i = Math.max(m[s.charAt(j)], i);
            len = Math.max(len, j - i + 1);
            m[s.charAt(j)] = j + 1;
        }
        return len;
    }


    /**
     * 滑动窗口
     *
     */
    public int lengthOfLongestSubstring3(String s) {
        if (s.length() == 0){
            return 0;
        }
        int max = 0;
        int i = 0,j = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (; j < s.length(); j++) {
            char temp = s.charAt(j);
            if (map.containsKey(temp)){
                i = Math.max(i,map.get(temp)+1);
            }
            map.put(s.charAt(j),j);
            max = Math.max(max,j-i+1);
        }
        return max;
    }

    public static void main(String[] args){
        Question3 quertion = new Question3();

        int res = quertion.lengthOfLongestSubstring3("aaaaa");
        System.out.println("res:"+res);
    }
}

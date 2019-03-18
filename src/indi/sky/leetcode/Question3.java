package indi.sky.leetcode;

import java.util.HashSet;
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

    public static void main(String[] args){
        Question3 quertion = new Question3();
        int res = quertion.lengthOfLongestSubstring("");
        System.out.println("res:"+res);
    }


}

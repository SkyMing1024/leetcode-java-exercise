package indi.sky.leetcode;

import indi.sky.util.CommonUtil;

/**
 *
 * 647.统计回文子串个数
 *
 * 给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。
 *
 * 回文字符串 是正着读和倒过来读一样的字符串。
 *
 * 子字符串 是字符串中的由连续字符组成的一个序列。
 *
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 *
 *
 *
 * 与第5题很像，都是统计回文子串相关
 */
public class Question647 {

    /**
     * 方法一：
     * 暴力循环，时间空间复杂度都是O(n^2)，两层循环，循环了n*n次，每次都产生了一个新的字符串变量
     * @param s
     * @return
     */
    public int countSubstrings1(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (CommonUtil.isPalinromel(str)){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Question647 q = new Question647();
        int i = q.countSubstrings1("abc");
        System.out.println(i);

    }


}

package indi.sky.leetcode;

/**
 * 5.最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 示例 1：
输入: "babad"
 输出: "bab"
 注意: "aba" 也是一个有效答案。
 */
public class Question5 {


    /**
     * 方法一：
     * 暴力循环，
     *
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        int n = s.length();
        if (n<=1){
            return s;
        }
        // 记录选出来的最大长度
        int l = 0;
        int a = 0,b=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isPalinromel(s,i,j)){
                    //
                    if (j-i>l){
                        l = j-i;
                        a = i;
                        b = j;
                    }
                    /**
                     * 注释中的写法错误, subString(s,e)函数再截取字符串时采用的是前闭后开区间 [s, e)
                     * if (j-i+1>l){
                         l = j-1+1;
                         a = i;
                         b = j+1;
                        }
                     */
                }
            }
        }
        return s.substring(a,b+1);
//        return s.substring(a,b);
    }

    public boolean isPalinromel(String s, int start, int end){
        for (int i = start,j=end; i<=j ; i++,j--) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Question5 quertion = new Question5();
        String s = "abcdcba";
//        boolean res = quertion.isPalinromel(s,0,s.length()-1);
        String longestStr = quertion.longestPalindrome1(s);
        System.out.println("res:"+longestStr);
    }
}

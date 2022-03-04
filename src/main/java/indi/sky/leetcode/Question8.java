package indi.sky.leetcode;

/**
 * 8. 字符串转换整数 (atoi)
 */
public class Question8 {

    public int myAtoi(String str) {
        final int Max = Integer.MAX_VALUE;
        final int Min = Integer.MIN_VALUE;
        int res = 0;
        char[] arr = str.toCharArray();



        return res;
    }

    public static void main(String[] args){
        Question8 question = new Question8();
        int res = question.myAtoi("-343");
        System.out.println("res:"+res);
    }
}

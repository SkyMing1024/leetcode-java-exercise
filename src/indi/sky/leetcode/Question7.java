package indi.sky.leetcode;

/**
 * 7. 整数反转
 */
public class Question7 {
    public int reverse(int x) {
        String s = this.reverse(String.valueOf(Math.abs(x)));
        if (x<0){
            s = "-"+s;
        }
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;
        int res = Integer.parseInt(s);
        return res;
    }

    public String reverse(String s){
        int n =s.length();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
             arr[n-i-1] = s.charAt(i);
        }
        return new String(arr);
    }

    public static void main(String[] args){
        Question7 quertion = new Question7();
        int res = quertion.reverse(1534236469);
        System.out.println("res:"+res);
    }
}

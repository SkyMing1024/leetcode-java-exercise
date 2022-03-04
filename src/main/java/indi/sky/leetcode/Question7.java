package indi.sky.leetcode;

/**
 * 7. 整数反转
 */
public class Question7 {
    int Max = Integer.MAX_VALUE;
    int Min = Integer.MIN_VALUE;
    public int reverse(int x) {
        String s = this.reverse(String.valueOf(Math.abs(x)));
        if (x<0){
            s = "-"+s;
        }
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

    public int reverseFinal(int x){
        int res = 0;
        while (x!=0){
            int p = x%10;
            x = x/10;
            // 重点: 判断有没有溢出
            if(res>Max/10 || (res == Max/10 && p>7)){
                return 0;
            }
            if (res<Min/10 || (res == Min/10 && p<-8)){
                return 0;
            }
            res = res*10+p;
        }
        return res;
    }

    public static void main(String[] args){
        Question7 quertion = new Question7();
        int res = quertion.reverseFinal(123);
        System.out.println("res:"+res);
    }
}

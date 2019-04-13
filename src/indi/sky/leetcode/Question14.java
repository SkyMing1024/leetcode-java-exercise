package indi.sky.leetcode;

/**
 * 14.最长公共前缀
 */
public class Question14 {

    /**
     * Description : 横向判断
     * 前两个字符串查找公共子串前缀pre, 再用pre与后面一个字符串查找
     * 注意:
     * 1.判断空数组
     * 2.循环字符串时,注意下标不要越界(strs[i+1])
     * 3.查找子串时,注意跳出循环的条件
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        String res = strs[0];
        for (int i = 0; i < strs.length-1; i++) {
            res = commonPre(res,strs[i+1]);
        }
        return res;
    }

    public String commonPre(String a, String b){
        String pre = "";
        for (int i = 0; i < Math.min(a.length(),b.length()); i++) {
            if (a.charAt(i) == b.charAt(i)){
                pre += String.valueOf(a.charAt(i));
            }else {
                break;
            }
        }
        return pre;
    }

    public static void main(String[] args){
        Question14 q = new Question14();
//        String pre = q.commonPre("abbdc","abbdier");
//        String res = q.longestCommonPrefix(new String[]{"1flower","2flow","3flight"});
        String res = q.longestCommonPrefix(new String[]{"aca","cba"});
        System.out.println(res);
    }
}

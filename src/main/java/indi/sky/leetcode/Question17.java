package indi.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 */
public class Question17 {
    public List<String> letterCombinations(String digits) {
        String[][] data = {{},{},
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","i"},
                {"j","k","l"},
                {"m","n","o"},
                {"p","q","r","s"},
                {"t","u","v"},
                {"w","x","y","z"},
        };

        List<String> list = new ArrayList<>();
        if (digits == ""){
            return list;
        }
        char[] arr = digits.toCharArray();
        List<String[]> strList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String[] s = data[Integer.parseInt(String.valueOf(arr[i]))];
            strList.add(s);
        }

        if (strList.iterator().hasNext()){
            String[] strArray = strList.iterator().next();
            System.out.println(strArray);
        }

        for (int i = 0; i < strList.size(); i++) {
            String[] ss = strList.get(i);

            System.out.println(ss);
        }
        return list;
    }

    public static void main(String[] args){
        Question17 quertion = new Question17();
        List<String> list = quertion.letterCombinations("234");
        System.out.println("res:"+list);
    }
}

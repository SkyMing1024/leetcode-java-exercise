package indi.sky.leetcode;

import java.util.HashSet;

/**
 */
public class commonQ {
    public static void main(String[] args){
        HashSet set = new HashSet();
        set.add(3);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(1);
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("b");
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("a");

        System.out.println(set);
        System.out.println(stringSet);
    }
}

package indi.sky.util;

import indi.sky.dataStructure.ListNode;

/**
 * type simple description.
 * <p>
 * type detailed description.
 *
 * @author sky
 * @project leetcode-java-execise
 * @createTime 2020/9/23 11:58
 */
public class ListUtil {
    public static ListNode createListNode( int...args){
        ListNode l1 = new ListNode(args[0]);
        ListNode last = l1;
        for (int i = 1; i < args.length; i++) {
            last.next = new ListNode(args[i]);
            last = last.next;
        }
        return l1;
    }

}

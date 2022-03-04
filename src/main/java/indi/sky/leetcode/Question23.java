package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

/**
 * 23 合并K个排序链表
 */

/**
 * Description :
 * 利用已知问题问题[21.合并两个有序链表], 依次两两合并链表, 链表1和链表2合并的结果再和链表3合并, 得到的结果再一次后面的合并
 * 时间复杂度: O(n^2)
 * 空间复杂度:
 * 缺点: 临时变量链表长度会越来越大,在和下一链表合并时,复杂度会逐渐变高
 */
public class Question23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0){
            return null;
        }
        if (lists.length == 1){
            return lists[0];
        }
        Question21 util = new Question21();
        ListNode res = util.mergeTwoLists(lists[0],lists[1]);
        for (int i = 2; i < lists.length; i++) {
            res = util.mergeTwoLists(res,lists[i]);
        }
        return res;
    }

    /**
     * Description :
     * 分治算法 递归求解
     * 如何分解?
     *    每次取出链表数组中的两个元素,合并成一个链表, 将此链表放在这个两个元素中靠前的元素的位置上,
     *    经过一次遍历, 数组变为原来的一半
     * 每次合格哪两个元素?
     *    将数组均分, 每次从前后两部分各取一个
     */
    public ListNode mergeKLists2(ListNode[] lists){
        int n = lists.length;
        if(n == 0){return null;}
        Question21 util = new Question21();
        while (n>1){
            int k = (n+1)/2;
            for (int i = 0; i < n/2; i++) {
                lists[i] = util.mergeTwoLists(lists[i],lists[i+k]);
            }
            n = k;
        }
        return lists[0];
    }

    public static void main(String[] args){
        ListNode ln1 = new ListNode(2);
//        ln1.next = new ListNode(3);
//        ln1.next.next = new ListNode(5);
        ListNode ln2 = new ListNode(-1);
//        ln2.next = new ListNode(8);
//        ln2.next.next = new ListNode(7);
        ListNode ln3 = new ListNode(9);
//        ln3.next = new ListNode(6);
//        ln3.next.next = new ListNode(9);
        ln1.print();
        ln2.print();
        ln3.print();
        Question23 q = new Question23();
        ListNode res = q.mergeKLists2(new ListNode[]{ln1,ln2,ln3});
        res.print();
    }
}

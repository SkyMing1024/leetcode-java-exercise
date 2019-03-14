package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 */


/**
 * Author : ming.tian
 * Date : 19:08 2019/3/14
 */
public class Question2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = this.getListNodeValue(l1) + this.getListNodeValue(l2);

        return l1;
    }

    private int getListNodeValue(ListNode l1){
        int a = l1.val;
        int n = 0;
        ListNode curNode = l1.next;
        while (curNode!=null) {
            n++;
            int b = curNode.val;
            for (int i = 0; i < n; i++) {
                b = b*10;
            }
            a+=b;
            curNode = curNode.next;
        }
        return a;
    }

    public static void main (String[] args){
        ListNode ln1 = new ListNode(3);
        ListNode ln2 = new ListNode(4);
        ListNode ln3 = new ListNode(2);
        ln1.next=ln2;
        ln2.next=ln3;
        Question2 q = new Question2();
        int a = q.getListNodeValue(ln1);
        System.out.println("结果:"+a);
    }
}

package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

import java.util.List;

/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 */


public class Question2 {

    /**
     * Description :
     * 方法一
     * 1.将链表代表的数用转成int型
     * 2.int型数相加
     * 3.将int结果用链表表示
     */
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        int a = this.getListNodeValue(l1) + this.getListNodeValue(l2);
        String str = String.valueOf(a);
        ListNode head = new ListNode(getEachBitInt(a,1));
        ListNode curryNode = head;
        for (int i = 2; i < str.length()+1 ; i++) {
            curryNode.next = new ListNode(getEachBitInt(a,i));
            curryNode = curryNode.next;
        }
        return head;
    }

    /**
     * Description :
     * 方法2
     * 循环链表,带进位运算
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2){

        return l1;
    }


    /**
     * Description : 求链表所代表的值.如: (2 -> 4 -> 3) => 342
     */
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

    /**
     * Description : 获取证书num的第n位上的数
     */
    private int getEachBitInt(int num, int n){
        String str = String.valueOf(num);
        int a = -1;
        int count = 1;
        while (count <= n) {
            a = num % 10;
            num = num / 10;
            count++;
        }
        return a;
    }

    public static void main (String[] args){


        ListNode ln1 = new ListNode(2);
        ListNode ln2 = new ListNode(4);
        ListNode ln3 = new ListNode(3);
        ln1.next=ln2;
        ln2.next=ln3;

        ListNode ln11 = new ListNode(5);
        ListNode ln22 = new ListNode(6);
        ListNode ln33 = new ListNode(4);
        ln11.next=ln22;
        ln22.next=ln33;
        Question2 q = new Question2();
        int a = q.getListNodeValue(ln1);
        int b = q.getListNodeValue(ln11);
        System.out.println("方法一结果:"+q.addTwoNumbers1(ln1,ln11));
    }
}

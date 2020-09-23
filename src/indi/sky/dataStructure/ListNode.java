package indi.sky.dataStructure;

import java.util.LinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    /**
     * Description : 删除第n个元素 n=1 . 2 . 3......
     */
    public void remove(int index){
        ListNode res = this;
        int count = 0;
        while (res!=null){
            count++;
            if (count == index-1){
                res.next = res.next.next;
                break;
            }else {
                res = res.next;
            }
        }
    }

    /**
     * Description : 打印链表
     */
    public void print(){
        ListNode tmp = this;
        StringBuilder res = new StringBuilder();
        while (tmp!=null){
            res.append(tmp.val);
            if (tmp.next!=null){
                res.append(" -> ");
            }
            tmp = tmp.next;
        }
        System.out.println(res);
    }
}

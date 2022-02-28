package indi.sky.leetcode;

import indi.sky.dataStructure.TreeNode;
import indi.sky.util.CommonUtil;

import java.util.ArrayList;
import java.util.List;

public class Question114 {


    /**
     * 解法一：
     * 递归法前序遍历，将所有节点放入list中，再for循环将每一个节点的左子节点置空，右节点置为下一节点
     * 时间复杂度 O(n)
     * 空间复杂度O(n)
     * @param root
     */
    public void flatten1(TreeNode root) {
        TreeNode res = root;
        ArrayList<TreeNode> list = new ArrayList<>();

        pre(root,list);

        for (int i = 0; i < list.size()-1; i++) {
            TreeNode node = list.get(i);
            node.left = null;
            node.right = list.get(i+1);
        }
    }

    public void pre(TreeNode node, List<TreeNode> list){
        if (node!= null){
            list.add(node);
            pre(node.left,list);
            pre(node.right,list);
        }
    }

    /**
     * 方法二：
     *
     * 空间复杂度O(1)，不额外使用空间
     * @param root
     */
    public void flatten2(TreeNode root) {

    }






    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node1.left = node2;
        node1.right =  node5;
        node2.left = node3;
        node2.right = node4;
        node5.right = node6;

        Question114 q = new Question114();
        q.flatten1(node1);
        System.out.println(1);
    }
}

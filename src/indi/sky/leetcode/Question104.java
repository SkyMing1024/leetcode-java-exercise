package indi.sky.leetcode;


import indi.sky.dataStructure.TreeNode;

/**
 * 104. 二叉树的最大深度
 */
public class Question104 {

    /**
     * Description :
     * 方法一
     *  递归 深度优先遍历
     */
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root != null){
            depth = Math.max(maxDepth(root.left),maxDepth(root.right));
        }else {
            return 0;
        }
        return depth+1;
    }
    public static void main(String[] args){
        Question104 quertion = new Question104();
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);
        int depth = quertion.maxDepth(tree);
        System.out.println(depth);
    }
}

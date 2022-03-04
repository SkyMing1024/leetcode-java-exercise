package indi.sky.leetcode;

import indi.sky.dataStructure.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N 叉树的后序遍历
 */
public class Question590 {
    List<Integer> list;
    public List<Integer> postorder(Node root) {
         list = new ArrayList<>();
         order(root);
        return list;
    }

    public void order(Node root){
        if (root == null){
            return ;
        }
        for (Node node : root.children){
            order(node);
        }
        list.add(root.val);
    }
}

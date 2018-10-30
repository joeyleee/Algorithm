package binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。

给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
 */
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
        // write code here
        Queue<TreeNode> qu = new LinkedList<>();
        TreeNode nlast=root,last=root;
        qu.offer(root);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        if(root==null)return null;
        while(!qu.isEmpty()){
            TreeNode node=qu.poll();
            temp.add(node.val);
            if(node.left!=null){
                qu.add(node.left);
                nlast=node.left;
            }
            if(node.right!=null){
                qu.add(node.right);
                nlast=node.right;
            }
            if(last==node){
                last=nlast;
                res.add(temp);
                temp =new ArrayList<>();
            }
        }
        int[][] result = new int[res.size()][];
        for(int i =0;i<res.size();i++){
            result[i]=new int[res.get(i).size()];
            for(int j =0;j<result[i].length;j++){
                result[i][j] = res.get(i).get(j);
            }
        }
        return result;

    }

}

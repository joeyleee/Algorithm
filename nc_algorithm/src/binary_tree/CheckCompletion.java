package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

/*
有一棵二叉树,请设计一个算法判断它是否是完全二叉树。

给定二叉树的根结点root，请返回一个bool值代表它是否为完全二叉树。树的结点个数小于等于500。
 */
public class CheckCompletion {
    public boolean chk(TreeNode root) {
        // write code here
        if(root==null)return true;
        boolean flag =true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left==null&&node.right!=null)return  false;
            if(!flag&&(node.left!=null||node.right!=null))return false;
            if(node.left!=null)queue.offer(node.left);
            if(node.right!=null)queue.offer(node.right);
            else flag =false;
        }
        return true;
    }
}

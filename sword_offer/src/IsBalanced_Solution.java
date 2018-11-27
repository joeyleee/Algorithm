import sun.reflect.generics.tree.Tree;

/*
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(helper(root)==-1)return  false;
        return true;
    }
    public int helper(TreeNode node){
        if(node==null)return 0;
        int left=helper(node.left);
        if(left==-1)return -1;
        int right=helper(node.right);
        if(right==-1)return -1;
        return Math.abs(left-right)>1?-1:1+Math.max(left,right);
    }
}

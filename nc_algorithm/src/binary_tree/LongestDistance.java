package binary_tree;
/*
从二叉树的节点A出发，可以向上或者向下走，但沿途的节点只能经过一次，当到达节点B时，路径上的节点数叫作A到B的距离。对于给定的一棵二叉树，求整棵树上节点间的最大距离。

给定一个二叉树的头结点root，请返回最大距离。保证点数大于等于2小于等于500.
 */
public class LongestDistance {
    private int res=0;
    public int findLongest(TreeNode root) {
        // write code here
        traverse(root);
        return res;
    }
    public int traverse(TreeNode root){
        if(root==null)return 0;
        int l=traverse(root.left);
        int r=traverse(root.right);
        res=Math.max(res,l+r+1);
        return Math.max(l,r)+1;
    }
}

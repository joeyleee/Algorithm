/*
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class TreeDepth {
    int maxDepth=0;
    public int TreeDepth(TreeNode root) {
        helper(root,1);
        return maxDepth;
    }
    public void helper(TreeNode node,int cur){
        if(node==null){
            return;
        }
        if(cur>maxDepth){
            maxDepth=cur;
        }
        helper(node.left,cur+1);
        helper(node.right,cur+1);
        cur--;
        return;
    }
}

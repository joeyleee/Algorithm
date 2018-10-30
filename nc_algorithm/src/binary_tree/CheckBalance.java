package binary_tree;
/*
有一棵二叉树，请设计一个算法判断这棵二叉树是否为平衡二叉树。

给定二叉树的根结点root，请返回一个bool值，代表这棵树是否为平衡二叉树。
 */
public class CheckBalance {
    public boolean check(TreeNode root) {
        // write code here
        if(checkChild(root)==-1)return false;
        return true;
    }
    public int checkChild(TreeNode node){
        if(node ==null)return 0;
        int lDepth=checkChild(node.left);
        int rDepth=checkChild(node.right);
        if(lDepth==-1||rDepth==-1)return -1;
        if(Math.abs(lDepth-rDepth)>=2)return -1;
        return lDepth>rDepth?lDepth+1:rDepth+1;

    }

}

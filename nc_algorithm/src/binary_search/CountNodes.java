package binary_search;
/*
给定一棵完全二叉树的根节点root，返回这棵树的节点个数。如果完全二叉树的节点数为N，请实现时间复杂度低于O(N)的解法。

给定树的根结点root，请返回树的大小。

Java(javac 1.8)重置
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class CountNodes {
    public int count(TreeNode root) {
        // write code here
        if(root==null)return 0;
        int count =0;
        TreeNode node =root.left;
        int l =0;
        while(node!=null){
            l++;
            node=node.left;
        }
        int r=0;
        node =root.right;
        while(node!=null){
            r++;
            node=node.left;
        }
        if(l==r){
            count=(int)Math.pow(2,l)+count(root.right);
        }
        else{
            count=(int)Math.pow(2,r)+count(root.left);
        }
        return count;

    }


}


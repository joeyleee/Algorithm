package binary_tree;
/*
有一棵二叉树，其中所有节点的值都不一样,找到含有节点最多 的搜索二叉子树,并返回这棵子树的头节点.

给定二叉树的头结点root，请返回所求的头结点,若出现多个节点最多的子树，返回头结点权值最大的。
 */
public class MaxSubtree {
    public TreeNode getMax(TreeNode root) {
        // write code here
        int[] temp =new int[3];
        return traverse(root,temp);
    }
    public TreeNode traverse(TreeNode root,int[] list){
        if(root==null){
            list[0]=Integer.MAX_VALUE;
            list[1]=Integer.MIN_VALUE;
            list[2]=0;
            return root;
        }
        TreeNode left=traverse(root.left,list);
        int lmin=list[0];
        int lmax=list[1];
        int lcot=list[2];
        TreeNode right=traverse(root.right,list);
        int rmin=list[0];
        int rmax=list[1];
        int rcot=list[2];
        list[0]=Math.min(lmin,root.val);
        list[1]=Math.max(root.val,rmax);
        if(left==root.left&&right==root.right&&lmax<root.val&&rmin>root.val){
            list[2]=rcot+lcot+1;
            return root;
        }
        list[2]=Math.max(lcot,rcot);
        return lcot>rcot?left:right;
    }
}

/*
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Convert {
    TreeNode nodeList =null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode res=null;
        if(pRootOfTree==null)return res;
        helper(pRootOfTree);
        res=pRootOfTree;
        while(res.left!=null){
            res=res.left;
        }
        return  res;

    }
    public void helper(TreeNode root){
        if(root==null)return;
        helper(root.left);
        root.left=nodeList;
        if(nodeList!=null){
            nodeList.right=root;
        }
        nodeList=root;
        helper(root.right);
    }
}

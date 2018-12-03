/*
请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class IsSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)return true;
        return helper(pRoot.left,pRoot.right);
    }
    boolean helper(TreeNode node1,TreeNode node2){
        if(node1==null){
            if(node2==null)return true;
            return false;
        }
        if(node2==null)return  false;
        if(node1.val!=node2.val)return false;
        return helper(node1.left,node2.right)&&helper(node1.right,node2.left);
    }
}

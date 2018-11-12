import java.util.Stack;

/*
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null)return  false;
        Stack<TreeNode> s=new Stack<>();
        TreeNode node=root1;
        while(!s.isEmpty()||node!=null){
            while(node!=null){
                if(node.val==root2.val&&traceIsAlike(node,root2)){
                    return true;
                }
                s.push(node);
                node=node.left;
            }
            node=s.pop().right;
        }
        return false;
    }
    public boolean traceIsAlike(TreeNode root1,TreeNode root2) {
        if(root2==null){
            return  true;
        }
        if(root1==null){
            return false;
        }
        if(root1.val!=root2.val)return  false;
        return traceIsAlike(root1.left,root2.left)&&traceIsAlike(root1.right,root2.right);
    }
}


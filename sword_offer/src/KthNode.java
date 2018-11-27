import java.util.Stack;

/*
给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class KthNode {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null||k<=0){
            return null;
        }
        TreeNode node=pRoot;
        Stack<TreeNode> s=new Stack<>();
        while(node!=null||!s.isEmpty()){
            if(node!=null){
                s.push(node);
                node=node.left;
            }
            else {
                node = s.pop();
                k--;
                if (k == 0) {
                    return node;
                }
                node = node.right;
            }
        }
        return null;
    }
}

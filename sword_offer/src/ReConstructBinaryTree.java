/*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class ReConstructBinaryTree {
    public   TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        return helper(pre,in,0,pre.length-1,0,in.length-1);
    }
    public  TreeNode helper(int[] pre,int[] in,int pstart,int pend,int istart,int iend){
        if(pstart>pend||istart>iend){
            return  null;
        }
        TreeNode node =new TreeNode(pre[pstart]);
        int index=0;
        for(int i=istart;i<in.length;i++){
            if(in[i]==pre[pstart]){
                index=i;
                break;
            }
        }
        int llen=index-istart;
        node.left=helper(pre,in,pstart+1,pstart+llen,istart,index-1);
        node.right=helper(pre,in,pstart+llen+1,pend,index+1,iend);
        return node;
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

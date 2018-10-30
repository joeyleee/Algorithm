package binary_tree;

import java.util.LinkedList;
import java.util.List;

/*
请用递归方式实现二叉树的先序、中序和后序的遍历打印。

给定一个二叉树的根结点root，请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class TreeToSequence {
    public int[][] convert(TreeNode root) {
        // write code here
        List<Integer> preList =new LinkedList<>();
        List<Integer> infixList =new LinkedList<>();
        List<Integer> sufixList =new LinkedList<>();
        pre(root,preList);
        infix(root,infixList);
        sufix(root,sufixList);
        int[][]res =new int[3][preList.size()];
        for(int i=0;i<preList.size();i++){
            res[0][i]=preList.get(i);
            res[1][i]=infixList.get(i);
            res[2][i]=sufixList.get(i);
        }
        return res;
    }
    public void pre(TreeNode root,List<Integer> res){
        if(root==null){
            return ;
        }
        res.add(root.val);
        pre(root.left,res);
        pre(root.right,res);
    }
    public void infix(TreeNode root,List<Integer> res){
        if(root==null){
            return ;
        }
        infix(root.left,res);
        res.add(root.val);
        infix(root.right,res);
    }
    public void sufix(TreeNode root,List<Integer> res){
        if(root==null){
            return ;
        }
        sufix(root.left,res);
        sufix(root.right,res);
        res.add(root.val);

    }
}
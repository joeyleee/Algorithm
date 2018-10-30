package binary_tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TreeToSequence2 {
    public int[][] convert(TreeNode root) {
        // write code here
        List<Integer> preList =new LinkedList<>();
        List<Integer> infixList =new LinkedList<>();
        List<Integer> sufixList =new LinkedList<>();
        pre(root,preList);
        infix(root,infixList);
        suffix(root,sufixList);
        int[][]res =new int[3][preList.size()];
        for(int i=0;i<preList.size();i++){
            res[0][i]=preList.get(i);
            res[1][i]=infixList.get(i);
            res[2][i]=sufixList.get(i);
        }
        return res;
    }
    public static void pre(TreeNode root,List res){
        Stack<TreeNode> s =new Stack<>();
        TreeNode node =root;
        if(node!=null){
            s.push(node);
        }
        else{
            return ;
        }
        while(!s.isEmpty()) {
            node=s.pop();
            res.add(node.val);
            if(node.right!=null){
                s.push(node.right);
            }
            if(node.left!=null){
                s.push(node.left);
            }
        }
    }
    public static void infix(TreeNode root,List res){
        Stack<TreeNode> s =new Stack<>();
        TreeNode node =root;
        if(node==null){
            return;
        }
        while(node!=null||!s.isEmpty()){
            while(node!=null){
                s.push(node);
                node = node.left;
            }
            node=s.pop();
            res.add(node.val);
            node=node.right;
        }
    }

    public static void suffix(TreeNode root,List res){
        Stack<TreeNode> s =new Stack<>();
        TreeNode node =root;
        TreeNode last =root;
        TreeNode top=root;
        if(node!=null){
            s.push(node);
        }
        else{
            return ;
        }
        while(!s.isEmpty()) {
            if(top.left!=null&&last!=top.left&&last!=top.right){
                s.push(top.left);
                top=s.peek();
            }
            else if(top.right!=null&&last!=top.right){
                s.push(top.right);
                top=s.peek();
            }
            else{
                last=s.pop();
                res.add(last.val);
                if(!s.isEmpty()){top=s.peek();}
            }
        }
    }
}

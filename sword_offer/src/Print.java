import java.util.ArrayList;
import java.util.Stack;

/*
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(pRoot==null)return res;
        s1.push(pRoot);
        while(!s1.isEmpty()||!s2.isEmpty()){
            ArrayList<Integer> temp1=new ArrayList<>();
            while(!s1.isEmpty()){
                TreeNode node=s1.pop();
                if(node!=null) {
                    temp1.add(node.val);
                    s2.push(node.left);
                    s2.push(node.right);
                }
            }
            if(temp1.size()>0) {
                res.add(temp1);
            }
            ArrayList<Integer> temp2=new ArrayList<>();
            while(!s2.isEmpty()){
                    TreeNode node=s2.pop();
                    if(node!=null){
                        temp2.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }
            }
            if(temp2.size()>0) {
                res.add(temp2);
            }
        }
        return res;
    }
}

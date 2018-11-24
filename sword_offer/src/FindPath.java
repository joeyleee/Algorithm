import java.util.ArrayList;

/*
输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null)return  res;
        ArrayList<Integer> temp =new ArrayList<>();
        helper(root,target,0,temp,res);
        return res;
    }
    public void helper(TreeNode node,int target,int cur,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> res){
        if(node==null)return;
        cur+=node.val;
        temp.add(node.val);
        if(cur==target&&node.left==null&&node.right==null){
            ArrayList<Integer> aRes =new ArrayList<>(temp);
            res.add(aRes);
        }
        else if(cur>=target){
            return;
        }
        else{
            helper(node.left,target,cur,temp,res);
            helper(node.right,target,cur,temp,res);
        }
        temp.remove(temp.size()-1);
        return;
    }
}

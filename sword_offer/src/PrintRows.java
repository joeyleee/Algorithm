import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class PrintRows {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        if(pRoot==null)return res;
        Queue<TreeNode> q=new LinkedList<>();
        int num=1;
        q.offer(pRoot);
        ArrayList<Integer> temp=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            temp.add(node.val);
            num--;
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
            if(num==0){
                res.add(temp);
                temp=new ArrayList<>();
                num=q.size();
            }
        }
        return res;
    }
}

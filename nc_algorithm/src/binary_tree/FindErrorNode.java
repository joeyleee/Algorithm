package binary_tree;

import java.util.LinkedList;
import java.util.List;

/*
一棵二叉树原本是搜索二叉树，但是其中有两个节点调换了位置，使得这棵二叉树不再是搜索二叉树，请找到这两个错误节点并返回他们的值。保证二叉树中结点的值各不相同。

给定一棵树的根结点，请返回两个调换了位置的值，其中小的值在前。
 */
public class FindErrorNode {
    public int[] findError(TreeNode root) {
        // write code here
        List<Integer> temp=new LinkedList<>();
        traversal(root,temp);
        int count=0;
        int[] res= new int[2];
        int index1=-1;
        int index2=-1;
        for(int i=0;i<temp.size()-1;i++){
            if(index1==-1&&temp.get(i)>temp.get(i+1)){
                index1=i;
                count++;
            }
            else if(temp.get(i)>temp.get(i+1)){
                index2=i;
                count++;
            }
        }
        if(count==1){
            res[0]=temp.get(index1+1);
            res[1]=temp.get(index1);
        }
        else{
            res[0]=temp.get(index2+1);
            res[1]=temp.get(index1);
        }
        return res;
    }
    public void traversal (TreeNode node,List temp){
        if(node==null){
            return;
        }
        traversal(node.left,temp);
        temp.add(node.val);
        traversal(node.right,temp);
    }
}

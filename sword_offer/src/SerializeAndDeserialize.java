/*
请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class SerializeAndDeserialize {
    int index=-1;
    String Serialize(TreeNode root) {
        StringBuffer sb =new StringBuffer();
        helper1(root,sb);
        return sb.toString();
    }
    public void helper1(TreeNode root,StringBuffer sb){
        if(root==null){
            sb.append("$,");
            return;
        }
        sb.append(root.val);
        sb.append(',');
        helper1(root.left,sb);
        helper1(root.right,sb);
        return;
    }
    TreeNode Deserialize(String str) {
        String[] strs=str.split(",");
        return  helper2(strs);
    }
    public TreeNode helper2(String[] strs){
        index++;
        if(index<strs.length&&!strs[index].equals("$")){
            TreeNode node =new TreeNode(Integer.parseInt(strs[index]));
            node.left= helper2(strs);
            node.right=helper2(strs);
            return node;
        }
        return null;
    }
}

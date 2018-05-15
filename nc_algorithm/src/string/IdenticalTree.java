package string;

/*
对于两棵彼此独立的二叉树A和B，请编写一个高效算法，检查A中是否存在一棵子树与B树的拓扑结构完全相同。

给定两棵二叉树的头结点A和B，请返回一个bool值，代表A中是否存在一棵同构于B的子树。

测试用例:
{1,2,3,4,5,6,7},{4}

对应输出应该为:

true
 */
public class IdenticalTree {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean chkIdentical(TreeNode A, TreeNode B) {
        // write code here
        String s1 = serial(A);
        String s2 = serial(B);
        return !(s1.indexOf(s2) == -1);
    }

    public String serial(TreeNode t) {
        if (t == null) return "#!";
        String res = t.val + "!";
        res += serial(t.left);
        res += serial(t.right);
        return res;
    }
}




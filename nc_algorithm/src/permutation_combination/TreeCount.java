package permutation_combination;
/*
求n个无差别的节点构成的二叉树有多少种不同的结构？

给定一个整数n，请返回不同结构的二叉树的个数。保证结果在int范围内。

测试样例：
1
返回：1
 */
public class TreeCount {
    public int countWays(int n) {
        // write code here
        int res=1;
        for(int i=n+1;i<=2*n;i++)res*=i;
        for(int i=1;i<=n+1;i++)res/=i;
        return res;
    }
}

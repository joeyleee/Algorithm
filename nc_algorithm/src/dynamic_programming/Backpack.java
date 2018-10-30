package dynamic_programming;
/*
一个背包有一定的承重cap，有N件物品，每件都有自己的价值，记录在数组v中，也都有自己的重量，记录在数组w中，每件物品只能选择要装入背包还是不装入背包，要求在不超过背包承重的前提下，选出物品的总价值最大。

给定物品的重量w价值v及物品数n和承重cap。请返回最大总价值。

测试样例：
[1,2,3],[1,2,3],3,6
返回：6
 */
public class Backpack {
    public int maxValue(int[] w, int[] v, int n, int cap) {
        // write code here
        int[][] dp=new int[n][cap+1];
        dp[0][0]=0;
        for(int i=1;i<=cap;i++)dp[0][i]=i<w[0]?0:v[0];
        for(int i=1;i<n;i++){
            for(int j=1;j<=cap;j++){
                if(j-w[i]>=0){
                    dp[i][j]=dp[i-1][j-w[i]]+v[i];
                }
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j]);
            }
        }
        return dp[n-1][cap];
    }
    public static void main(String[] args){
        int[] w={1,2,3};
        int[] v={1,2,3};
        Backpack bp=new Backpack();
        bp.maxValue(w,v,3,6);

    }
}

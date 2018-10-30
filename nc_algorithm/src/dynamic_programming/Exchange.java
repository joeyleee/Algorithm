package dynamic_programming;
/*
有数组penny，penny中所有的值都为正数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，再给定一个整数aim(小于等于1000)代表要找的钱数，求换钱有多少种方法。

给定数组penny及它的大小(小于等于50)，同时给定一个整数aim，请返回有多少种方法可以凑成aim。

测试样例：
[1,2,4],3,3
返回：2
 */
public class Exchange {
    public int countWays(int[] penny, int n, int aim) {
        // write code here
        int[][] dp=new int[n][aim+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<=aim;i++){
            if(i%penny[0]==0) {
                dp[0][i] =1;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=aim;j++){
                if(j-penny[i]>=0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - penny[i]];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n-1][aim];
    }
    public static void main(String[] args){
        Exchange ex =new Exchange();
        int[] arg={1,2,4};
        ex.countWays(arg,3,3);
    }
}

package dynamic_programming;
/*
有n级台阶，一个人每次上一级或者两级，问有多少种走完n级台阶的方法。为了防止溢出，请将结果Mod 1000000007

给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
 */
public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        if(n==1)return 1;
        if(n==2)return 2;
        long[] dp=new long[n];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return (int)dp[n-1];
    }
}

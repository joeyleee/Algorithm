package dynamic_programming;
/*
给定两个字符串A和B，返回两个字符串的最长公共子序列的长度。例如，A="1A2C3D4B56”，B="B1D23CA45B6A”，”123456"或者"12C4B6"都是最长公共子序列。

给定两个字符串A和B，同时给定两个串的长度n和m，请返回最长公共子序列的长度。保证两串长度均小于等于300。

测试样例：
"1A2C3D4B56",10,"B1D23CA45B6A",12
返回：6
 */
public class LCS {
    public int findLCS(String A, int n, String B, int m) {
        // write code here
        int[][] dp=new int[n][m];
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();
        dp[0][0]=a[0]==b[0]?1:0;
        for(int i=1;i<n;i++)dp[i][0]=a[i]==b[0]?1:dp[i-1][0];
        for(int i=1;i<m;i++)dp[0][i]=a[0]==b[i]?1:dp[0][i-1];
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                if(a[i]==b[j])dp[i][j]=Math.max(dp[i-1][j-1]+1,dp[i][j]);
            }
        }
        return dp[n-1][m-1];
    }
}

package brain_puzzles;
/*
你要在一个nxm的格子图上涂色，你每次可以选择一个未涂色的格子涂上你开始选定的那种颜色。同时为了美观，我们要求你涂色的格子不能相邻，也就是说，不能有公共边，现在问你，在采取最优策略的情况下，你最多能涂多少个格子？

给定格子图的长n和宽m。请返回最多能涂的格子数目。

测试样例：
1,2
返回：1
 */
public class Paint {
    public int getMost(int n, int m) {
        // write code here
        int[][] paint =new int[n][m];
        int num=0;
        paint[0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j%2==0&&i%2==0){
                    num++;
                }
                else if(i%2!=0&&j%2!=0){
                    num++;
                }
            }
        }
        return m*n-num>num?m*n-num:num;
    }
}

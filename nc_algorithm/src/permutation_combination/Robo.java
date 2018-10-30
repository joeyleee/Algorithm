package permutation_combination;
/*
在XxY的方格中，以左上角格子为起点，右下角格子为终点，每次只能向下走或者向右走，请问一共有多少种不同的走法

给定两个正整数int x,int y，请返回走法数目。保证x＋y小于等于12。

测试样例：
2,2
返回：2
 */
public class Robo{
    public int countWays(int x, int y) {
        // write code here
        x--;y--;
        int res=1;
        for(int i=x+y;i>y;i--){
            res*=i;
        }
        for(int i=x;i>=1;i--){
            res/=i;
        }
        return res;
    }
}

package permutation_combination;
/*
n颗相同的糖果，分给m个人，每人至少一颗，问有多少种分法。

给定n和m，请返回方案数，保证n小于等于12，且m小于等于n。

测试样例：
10,3
返回：36
 */
public class Distribution {
    public int getWays(int n, int m) {
        // write code here
        int res=1;
        for(int i=n-1;i>n-m;i--)res*=i;
        for(int i=m-1;i>1;i--)res/=i;
        return res;
    }
}

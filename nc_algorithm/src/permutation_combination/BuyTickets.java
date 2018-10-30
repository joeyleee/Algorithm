package permutation_combination;
/*
2n个人排队买票，n个人拿5块钱，n个人拿10块钱，票价是5块钱1张，每个人买一张票，售票员手里没有零钱，问有多少种排队方法让售票员可以顺利卖票。

给定一个整数n，请返回所求的排队方案个数。保证结果在int范围内。

测试样例：
1
返回：1
 */

public class BuyTickets {
    public int countWays(int n) {
        // write code here
        int res=1;
        for(int i=n+1;i<=2*n;i++)res*=i;
        for(int i=1;i<=n+1;i++)res/=i;
        return res;
    }
}

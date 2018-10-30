package permutation_combination;
/*
n个数进出栈的顺序有多少种？假设栈的容量无限大。

给定一个整数n，请返回所求的进出栈顺序个数。保证结果在int范围内。

测试样例：
1
返回：1
 */
public class Stack {
    public int countWays(int n) {
        // write code here
        int res=1;
        for(int i=2*n;i>n;i--)res*=i;
        for(int i=n;i>1;i--)res/=i;
        return res/(n+1);
    }
}

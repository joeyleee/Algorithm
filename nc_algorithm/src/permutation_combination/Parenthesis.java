package permutation_combination;
/*
假设有n对左右括号，请求出合法的排列有多少个？合法是指每一个括号都可以找到与之配对的括号，比如n=1时，()是合法的，但是)(为不合法。

给定一个整数n，请返回所求的合法排列数。保证结果在int范围内。

测试样例：
1
返回：1
 */
public class Parenthesis {
    public int countLegalWays(int n) {
        // write code here
        int res=1;
        for(int i=2*n;i>n;i--)res*=i;
        for(int i=n;i>1;i--)res/=i;
        return res/(n+1);
    }
}

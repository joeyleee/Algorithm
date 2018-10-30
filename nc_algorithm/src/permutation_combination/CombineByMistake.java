package permutation_combination;
/*
有n个信封，包含n封信，现在把信拿出来，再装回去，要求每封信不能装回它原来的信封，问有多少种装法?

给定一个整数n，请返回装发个数，为了防止溢出，请返回结果Mod 1000000007的值。保证n的大小小于等于300。

测试样例：
2
返回：1
 */
public class CombineByMistake {
    public int countWays(int n) {
        // write code here
        long[] res=new long[n+1];
        res[0]=0;
        res[1]=0;
        if (n>=2){
            res[2]=1;
            for(int i=3;i<=n;i++){
                res[i]=(i-1)*(res[i-1]+res[i-2])%1000000007;
            }
        }
        return (int)res[n];
    }
}

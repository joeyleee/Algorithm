package binary_search;



/*
如果更快的求一个整数k的n次方。如果两个整数相乘并得到结果的时间复杂度为O(1)，得到整数k的N次方的过程请实现时间复杂度为O(logN)的方法。

给定k和n，请返回k的n次方，为了防止溢出，请返回结果Mod 1000000007的值。

测试样例：
2,3
返回：8
 */
public class QuickPower {
    public static int getPower(int k, int N) {
        // write code here
        long res =1;
        long temp=k;
        while(N!=0){
            if((N&1)!=0){
                res*=temp;
            }
            N=N>>1;
            temp=(temp*temp)%1000000007;
            res=res%1000000007;
        }
        //System.out.println(res);
        return (int)res%1000000007;
    }
    public static void main(String[] args){
        QuickPower.getPower(2,14876069);
    }

}

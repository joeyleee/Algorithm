package bit_operation;
/*
对于两个32位整数a和b，请设计一个算法返回a和b中较大的。但是不能用任何比较判断。若两数相同，返回任意一个。

给定两个整数a和b，请返回较大的数。

测试样例：
1,2
返回：2
 */
public class Compare {
    public int getMax(int a, int b) {
        // write code here
        int signA=sign(a);
        int signB=sign(b);
        if((signA^signB)==1){
            return signA==1?b:a;
        }
        else{
            int c=a-b;
            return sign(c)*b+flip(sign(c))*a;
        }

    }
    public int flip(int n){
        return n^1;
    }
    public int sign(int n){
        return(n>>31)&1;
    }
}

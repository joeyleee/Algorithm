package permutation_combination;
/*
A(A也是他的编号)是一个孤傲的人，在一个n个人(其中编号依次为1到n)的队列中，他于其中的标号为b和标号c的人都有矛盾，所以他不会和他们站在相邻的位置。现在问你满足A的要求的对列有多少种？

给定人数n和三个人的标号A,b和c，请返回所求答案，保证人数小于等于11且大于等于3。

测试样例：
6,1,2,3
288
 */
public class LonelyA {
    public int getWays(int n, int A, int b, int c) {
        // write code here
        if(n<=3)return 0;
        int res=1;
        int doubleNum=1;
        int tripleNum=1;
        for(int i=n;i>1;i--)res*=i;
        for(int i=n-1;i>1;i--)doubleNum*=i;
        for(int i=n-2;i>1;i--)tripleNum*=i;
        return res-4*doubleNum+2*tripleNum;
    }
}

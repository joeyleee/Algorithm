package probability;
/*
有2k只球队，有k-1个强队，其余都是弱队，随机把它们分成k组比赛，每组两个队，问两强相遇的概率是多大？

给定一个数k，请返回一个数组，其中有两个元素，分别为最终结果的分子和分母，请化成最简分数

测试样例：
4
返回：[3,7]
 */
public class Championship {
    public int[] calc(int k) {
        // write code here
        int deno=1;
        int nume=1;
        int[] res=new int[2];
        for(int i=2*k-1;i>1;i=i-2)deno*=i;
        for(int i=k+1;i>2;i--)nume*=i;
        for(int i=k-1;i>1;i--)nume/=i;
        for(int i=2;i<=k-1;i++)nume*=i;
        nume=deno-nume;
        int gcd=gcd(nume,deno);
        res[0]=nume/gcd;
        res[1]=deno/gcd;
        return res;
    }
    public int gcd (int x,int y){
        if(y==0)
            return x;
        else
            return gcd(y,x%y);
    }
}

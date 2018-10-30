package probability;
/*
n只蚂蚁从正n边形的n个定点沿着边移动，速度是相同的，问它们碰头的概率是多少？

给定一个正整数n，请返回一个数组，其中两个元素分别为结果的分子和分母，请化为最简分数。

测试样例：
3
返回：[3,4]
 */
public class Ants {
    public int[] collision(int n) {
        // write code here
        int demon =2;
        int nume;
        int[] res =new int[2];
        for(int i=1;i<n;i++)demon*=2;
        nume=demon-2;
        int gcd=gcd(nume,demon);
        res[0]=nume/gcd;
        res[1]=demon/gcd;
        return res;
    }
    public int gcd (int x,int y){
        if(y==0)
            return x;
        else
            return gcd(y,x%y);
    }
}

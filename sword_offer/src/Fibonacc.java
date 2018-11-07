/*
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
 */
public class Fibonacc {
    public int Fibonacci(int n) {
        if(n<=1)return n;
        int num1=0;
        int num2=1;
        for(int i=1;i<n;i++){
            int temp=num2;
            num2=num1+num2;
            num1=temp;
        }
        return num2;
    }
}

/*
写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Add {
    public int Add(int num1,int num2) {
        int sum=num1^num2;
        int carry=(num1&num2)<<1;
        while((num1&num2)!=0){
            num1=sum;
            num2=carry;
            sum=num1^num2;
            carry=(num1&num2)<<1;
        }
        return sum^carry;
    }
}

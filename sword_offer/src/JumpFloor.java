/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if(target<=1){
            return target;
        }
        int num1=1;
        int num2=2;
        for(int i=2;i<target;i++){
            int temp=num2;
            num2=num2+num1;
            num1=temp;
        }
        return num2;
    }
}

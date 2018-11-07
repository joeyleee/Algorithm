package backtrack;
/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
    public int RectCover(int target) {
        if(target<=1)return target;
        int num1=1;
        int num2=2;
        for(int i=2;i<target;i++){
            int temp =num2;
            num2+=num1;
            num1=temp;
        }
        return num2;
    }
}

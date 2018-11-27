/*
一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null||array.length==0)return;;
        int num =0;
        for(int i:array){
            num=num^i;
        }
        int oneIndex=0;
        while(num!=0){
            if((num&1)==0){
                num=num>>1;
                oneIndex++;
            }
            else break;
        }
        num=1<<oneIndex;
        int numOne=0;
        int numTwo=0;
        for(int i:array){
            if((i&num)!=0){
                numOne^=i;
            }
            else{
                numTwo^=i;
            }
        }
        num1[0]=numOne;
        num2[0]=numTwo;
        return;
    }
}

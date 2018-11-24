/*
把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0)
        return 0;
        int curIndex=1;
        int[] temp=new int[index];
        temp[0]=1;
        int twoIndex=0;
        int threeIndex=0;
        int fiveIndex=0;
        while(curIndex<index){
            int cur=min(temp[threeIndex]*3,temp[twoIndex]*2,temp[fiveIndex]*5);
            temp[curIndex]=cur;
            while(temp[twoIndex]*2<=cur)twoIndex++;
            while(temp[threeIndex]*3<=cur)threeIndex++;
            while(temp[fiveIndex]*5<=cur)fiveIndex++;
            curIndex++;
        }
        return temp[index-1];
    }
    public int min(int num1,int num2,int num3){
        int res=0;
        if(num1<=num2){
            res=num1;
        }
        else{
            res=num2;
        }
        if(res<num3){
            return res;
        }else{
            return num3;
        }
    }
}

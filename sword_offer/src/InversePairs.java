/*
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class InversePairs {
    public int InversePairs(int [] array) {
        if(array==null||array.length==0)return 0;
        int[] copy=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            copy[i] = array[i];
        }
        return helper(array,copy,0,array.length-1);
    }
    public int helper(int[] data,int[] copy,int start,int end){
        if(start==end){
            copy[start]=data[start];
            return 0;
        }
        int len=(end-start)/2;
        int left=helper(copy,data,start,start+len);
        int right=helper(copy,data,start+len+1,end);
        int i=start+len;
        int j=end;
        int index=end;
        int count=0;
        while(i>=start&&j>=start+len+1){
            if(data[i]>data[j]){
                copy[index--]=data[i--];
                count+=j-start-len;
                count=count%1000000007;
            }
            else{
                copy[index--]=data[j--];
            }
        }
        for(;j>=start+len+1;j--){
            copy[index--]=data[j];
        }
        for(;i>=start;i--){
            copy[index--]=data[i];
        }
        return (count+left+right)%1000000007;
    }
}

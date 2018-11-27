/*
统计一个数字在排序数组中出现的次数。
 */
public class GetNumberOfK {
    int left=Integer.MAX_VALUE;
    int right=-1;
    public int GetNumberOfK(int [] array , int k) {
        helper(array,0,array.length,k);
        if(right==-1)return 0;
        return right-left+1;

    }
    public void helper(int[] array,int start,int end,int target){
        if(start>end||start>array.length-1||end<0){
            return;
        }
        int mid =(end+start)/2;
        if(array[mid]<target){
            helper(array,mid+1,end,target);
        }
        else if(array[mid]>target){
            helper(array,start,mid-1,target);
        }
        else{
            if(mid<left){
                left=mid;
            }
            if(mid>right){
                right=mid;
            }
            helper(array,start,mid-1,target);
            helper(array,mid+1,end,target);
        }
        return;
    }
}

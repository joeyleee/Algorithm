package binary_search;
/*
有一个有序数组arr，其中不含有重复元素，请找到满足arr[i]==i条件的最左的位置。如果所有位置上的数都不满足条件，返回-1。

给定有序数组arr及它的大小n，请返回所求值。

测试样例：
[-1,0,2,3],4
返回：2
 */
public class Find {
    public int findPos(int[] arr, int n) {
        // write code here
        int res=-1;
        int low =0,high=n-1,mid;
        while(low<high) {
            if (arr[low] > high) return res;
            if (arr[high] < low) return res;
            mid=low+(high-low)/2;
            if(arr[mid]>mid){
                high=mid-1;
            }
            if(arr[mid]<mid){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
}

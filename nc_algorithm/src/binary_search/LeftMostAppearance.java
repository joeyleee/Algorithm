package binary_search;
/*
对于一个有序数组arr，再给定一个整数num，请在arr中找到num这个数出现的最左边的位置。

给定一个数组arr及它的大小n，同时给定num。请返回所求位置。若该元素在数组中未出现，请返回-1。

测试样例：
[1,2,3,3,4],5,3
返回：2
 */
public class LeftMostAppearance {
    public int findPos(int[] arr, int n, int num) {
        // write code here
        if(n==0)return -1;
        int start=0,end=n-1,res=-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]==num)res =mid;
            if(arr[mid]>=num){
                end = mid-1;
            }
            else if(arr[mid]<num){
                start = mid+1;
            }
        }
        return res;
    }
}

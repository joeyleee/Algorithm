package binary_search;
/*
对于一个有序循环数组arr，返回arr中的最小值。有序循环数组是指，有序数组左边任意长度的部分放到右边去，右边的部分拿到左边来。比如数组[1,2,3,3,4]，是有序循环数组，[4,1,2,3,3]也是。

给定数组arr及它的大小n，请返回最小值。

测试样例：
[4,1,2,3,3],5
返回：1
 */
public class MinValue {
    public int getMin(int[] arr, int n) {
        // write code here
        if(n==0)return 0;
        int start =0,end=n-1,mid=0;
            while(start<end){
                if(start==end-1){
                    break;
                }
                if(arr[start]<arr[end])return arr[start];
                mid =start+(end-start)/2;
                if(arr[start]>arr[mid]){
                    end=mid;
                    continue;
                }
                else if(arr[mid]>arr[end]){
                    start=mid;
                    continue;
                }
                while(start<mid){
                    if(arr[start]==arr[mid]){
                        start++;
                    }
                    else if(arr[start]<arr[mid]){
                        return arr[start];
                    }else{
                        end=mid;
                        break;
                    }
                }
            }
            return Math.min(arr[start],arr[end]);
    }
}
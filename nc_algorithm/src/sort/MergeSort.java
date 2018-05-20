package sort;
/*
对于一个int数组，请编写一个归并排序算法，对数组元素排序。

给定一个int数组A及数组的大小n，请返回排序后的数组。

测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
 */
public class MergeSort {
    public int[] mergeSort(int[] A, int n) {
        // write code here
        subMerge(A,0,n-1);
        return A;
    }
    public static void subMerge(int[] A,int left,int right){
        if(left==right)return ;
        int mid = (left+right)/2;
        subMerge(A,left,mid);
        subMerge(A,mid+1,right);
        merge(A,left,mid,right);
    }
    public static void merge(int[] A,int left,int mid,int right){
        int[] help = new int[right-left+1];
        int index = 0;
        int l=left,r=mid+1;
        while(l<=mid&&r<=right){
            if(A[r]<=A[l]){
                help[index++]=A[r++];
            }
            else{
                help[index++]=A[l++];
            }
        }
        if(l<=mid){
            help[index++]=A[l++];
        }
        if(r<=right){
            help[index++]=A[r++];
        }
        for(int i = 0;i<help.length;i++){
            A[left+i] = help[i];

        }
    }
}

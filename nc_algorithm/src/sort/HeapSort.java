package sort;
/*
对于一个int数组，请编写一个堆排序算法，对数组元素排序。

给定一个int数组A及数组的大小n，请返回排序后的数组。

测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
 */
public class HeapSort {
    public int[] heapSort(int[] A, int n) {
        // write code here
        int end = n-1;
        for(int i = n/2+1;i>=0;i--)adjustHeap(A,i,end);
        while(end>=0){
            int temp = A[end];
            A[end] = A[0];
            A[0] = temp;
            adjustHeap(A,0,--end);

        }
        return A;
    }
    public static void adjustHeap(int[] A,int i,int end){
        int p = i,c = 2 * p +1,val = A[i];
        while(c<=end){
            if(c<end&&A[c]<A[c+1])c++;
            if(A[c]>A[p]){
                A[p]=A[c];
                p = c;
                c = 2 * p + 1;
            }
            else break;
            A[p] = val;
        }

    }
}
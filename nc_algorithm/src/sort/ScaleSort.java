package sort;

import java.util.Arrays;

/*
已知一个几乎有序的数组，几乎有序是指，如果把数组排好顺序的话，每个元素移动的距离可以不超过k，并且k相对于数组来说比较小。请选择一个合适的排序算法针对这个数据进行排序。

给定一个int数组A，同时给定A的大小n和题意中的k，请返回排序后的数组。

测试样例：
[2,1,4,3,6,5,8,7,10,9],10,2
返回：[1,2,3,4,5,6,7,8,9,10]
 */
public class ScaleSort {
    public  int[] sortElement(int[] A, int n, int k) {
        // write code here
        if(A==null||A.length<2)return A;
        int[] heap = Arrays.copyOf(A,k);
        for(int i =k/2-1;i>=0;i--)adjustHeap(heap,i,k);
        for(int i =0;i<n-k;i++){
            A[i]=heap[0];
            heap[0]=A[i+k];
            adjustHeap(heap,0,k);
        }
        for(int j = 0;j<k;j++){
            A[n-k+j]=heap[0];
            heap[0]= heap[k-j-1];
            adjustHeap(heap,0,k-j-1);

        }
        return A;


    }
    public static void adjustHeap(int[] A,int i,int end){
        int p = i,c = 2 * p +1,val = A[i];
        while(c<end){
            if(c+1<end&&A[c]>A[c+1])c++;
            if(A[c]<A[p]){
                A[p]=A[c];
                p = c;
                c = 2 * p + 1;
            }
            else break;
            A[p] = val;
        }

    }
}

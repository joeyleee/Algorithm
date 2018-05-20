package sort;
/*
对于一个int数组，请编写一个希尔排序算法，对数组元素排序。

给定一个int数组A及数组的大小n，请返回排序后的数组。保证元素小于等于2000。

测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
 */
public class ShellSort {
    public int[] shellSort(int[] A, int n) {
        // write code here
        int shl = n/2;
        int index;
        while(shl>=1){
            for(int i = shl ;i < n;i++  ){
                index = i;
                while(index>=shl){
                    if(A[index-shl]>A[index]){
                        int temp = A[index];
                        A[index] = A[index-shl];
                        A[index-shl] = temp;
                        index-=shl;
                    }
                    else break;
                }


            }
            shl/=2;
        }

        return A;
    }

}

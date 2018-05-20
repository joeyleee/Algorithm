package sort;
/*
对于一个int数组，请编写一个插入排序算法，对数组元素排序。

给定一个int数组A及数组的大小n，请返回排序后的数组。

测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
 */
public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        // write code here
        for(int i = 1;i<n;i++ ){
            int index = i;
            for(int j = i ; j > 0;j--){
                if(A[j-1]>A[j]){
                    int temp = A[j-1];
                    A[j-1]= A[j];
                    A[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        return A;
    }
}
package sort;
/*
对于一个int数组，请编写一个选择排序算法，对数组元素排序。

给定一个int数组A及数组的大小n，请返回排序后的数组。

测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
 */
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        for(int i = 0;i<n;i++){
            int index = i;
            for(int j =i+1;j<n;j++){
                if(A[index]>A[j]){
                    index = j;
                }
            }
            int temp=A[i];
            A[i]=A[index];
            A[index]=temp;
        }
        return A;
    }
}

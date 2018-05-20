package sort;
/*
对于一个int数组，请编写一个基数排序算法，对数组元素排序。

给定一个int数组A及数组的大小n，请返回排序后的数组。保证元素均小于等于2000。

测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
 */
public class RadixSort {
    public int[] radixSort(int[] A, int n) {
        // write code here
        int[][] counter = new int[10][n];
        int[] count = new int[10];
        int i = 1;
        while(i<1000){
            for(int j = 0; j < n; j++){
                int pos = A[j] / i % 10;
                counter[pos][count[pos]++] = A[j];
            }
            int index = 0;
            for( int j = 0;j<10;j++){
                for(int k =0;k<count[j];k++){
                    A[index] = counter[j][k];
                    index++;
                }
                count[j]=0;
            }
            i*=10;

        }
        return A;

    }
}
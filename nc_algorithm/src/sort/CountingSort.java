package sort;
/*
对于一个int数组，请编写一个计数排序算法，对数组元素排序。

给定一个int数组A及数组的大小n，请返回排序后的数组。

测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
 */
public class CountingSort {
    public int[] countingSort(int[] A, int n) {
        // write code here
        if(A == null || A.length <2){
            return A;
        }
        int min = A[0],max = A[0];
        for(int num : A){
            max = Math.max(num,max);
            min = Math.min(num,min);
        }
        int[] counter = new int[max-min+1];
        for(int num : A){
            counter[num - min]++;
        }
        int j = 0;
        for(int i = 0 ;i < counter.length;i++){
            while(counter[i]!=0){
                A[j++] =i+min;
                counter[i]--;
            }
        }
        return A;



    }
}

package sort;
/*
对于一个int数组，请编写一个快速排序算法，对数组元素排序。

给定一个int数组A及数组的大小n，请返回排序后的数组。

测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
 */
public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        // write code here
        if(A.length<2||A==null)return A;
        process(A,0,n-1);
        return A;
    }
    public static void process(int[] a,int low,int high ){
        if(high<low)return;
        int section = high+1;
        int index = high;
        while(index>=low){
            if(a[index]>=a[low]){
                section--;
                int temp = a[index];
                a[index]=a[section];
                a[section]=temp;
            }
            index--;
        }
        int mid = section;
        process(a,low,section-1);
        process(a,section+1,high);


    }

}

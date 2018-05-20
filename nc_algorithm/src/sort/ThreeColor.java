package sort;
/*
有一个只由0，1，2三种元素构成的整数数组，请使用交换、原地排序而不是使用计数进行排序。

给定一个只含0，1，2的整数数组A及它的大小，请返回排序后的数组。保证数组大小小于等于500。

测试样例：
[0,1,1,0,2,2],6
返回：[0,0,1,1,2,2]
 */
public class ThreeColor {
    public int[] sortThreeColor(int[] A, int n) {
        // write code here
        int zero = -1,two = n;
        int i = 0;
        while(i<two){
            if(A[i]==0){
                A[i]=A[++zero];
                A[zero]=0;
                i++;

            }
            else if(A[i]==2){
                A[i]=A[--two];
                A[two] = 2;


            }else{
                i++;
            }
        }
        return A;

    }
}
package sort;
/*
有两个从小到大排序以后的数组A和B，其中A的末端有足够的缓冲空容纳B。请编写一个方法，将B合并入A并排序。

给定两个有序int数组A和B，A中的缓冲空用0填充，同时给定A和B的真实大小int n和int m，请返回合并后的数组。
 */
public class Merge {
    public int[] mergeAB(int[] A, int[] B, int n, int m) {
        // write code here
        int a=n-1,b=m-1;
        int index = A.length-1;
        while(a>=0&&b>=0){
            if(A[a]>B[b]){
                A[index]=A[a];
                a--;
                index--;
            }
            else{
                A[index]=B[b];
                b--;
                index--;
            }
        }
        while(b>=0){
            A[index]=B[b];
            index--;
            b--;
        }
        return A;
    }
}
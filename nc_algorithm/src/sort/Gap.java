package sort;
/*
有一个整形数组A，请设计一个复杂度为O(n)的算法，算出排序后相邻两数的最大差值。

给定一个int数组A和A的大小n，请返回最大的差值。保证数组元素多于1个。

测试样例：
[1,2,5,4,6],5
返回：2
 */
public class Gap {
    public int maxGap(int[] A, int n) {
        // write code here

        int len = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        boolean[] hasNum = new boolean[len + 1];
        int[] maxs = new int[len + 1];
        int[] mins = new int[len + 1];
        int bid =0;
        for (int i = 0; i < len; i++) {
            bid = bucket(A[i], len, min, max);// 算出桶号
            mins[bid] = hasNum[bid] ? Math.min(mins[bid], A[i]) : A[i];
            maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], A[i]) : A[i];
            hasNum[bid] = true;
        }

        int index = 0;
        int a=0,res=0;
        while (index<= n) {
            if (hasNum[index++]) { // 找到第一个不空的桶
                a = maxs[index - 1];
                break;
            }
        }
        for(;index<=n;index++){
            if(hasNum[index]){
                res = Math.max(res,mins[index]-a);
                a=maxs[index];
            }
        }
        return res;

    }
    public int bucket(long num, long len, long min, long max) {
        return (int)(((num-min)/(max-min))*len);
    }

}
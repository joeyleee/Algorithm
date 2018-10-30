package probability;

import java.util.Random;

/*
给定一个长度为N且没有重复元素的数组arr和一个整数M，实现函数等概率随机打印arr中的M个数。
 */
public class RandomPrint {
    public int[] print(int[] arr, int N, int M) {
        Random rand =new Random();
        int[] res=new int[M];
        for(int i=1;i<=M;i++){
            int index=rand.nextInt(N-i);
            res[i-1]=arr[index];
            arr[index]=arr[M-i];
        }
        return res;
    }
}

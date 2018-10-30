package bit_operation;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
给定一个整型数组arr，其中有两个数出现了奇数次，其他的数都出现了偶数次，找到这两个数。要求时间复杂度为O(N)，额外空间复杂度为O(1)。

给定一个整形数组arr及它的大小n，请返回一个数组，其中两个元素为两个出现了奇数次的元素,请将他们按从小到大排列。

测试样例：
[1,2,4,4,2,1,3,5],8
返回：[3,5]
 */
public class OddAppearance2 {
    public int[] findOdds(int[] arr, int n) {
        // write code here
        int num=0;
        int[]res =new int[2];
        for(int a:arr){
            num^=a;
        }
        int one=0;
        int count=0;
        for(int i=0;i<32;i++){
            int temp=1<<i;

            if((num&temp)!=0){
                count=i;
                break;
            }
        }
        one=(1<<count);
        for(int a:arr){
            if((a&one)!=0){
                res[0]^=a;
            }
        }
        res[1]=res[0]^num;
        Arrays.sort(res);
        return res;
    }
}

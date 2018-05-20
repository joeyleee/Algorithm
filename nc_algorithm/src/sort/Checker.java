package sort;

import java.util.Arrays;

/*
请设计一个高效算法，判断数组中是否有重复值。必须保证额外空间复杂度为O(1)。

给定一个int数组A及它的大小n，请返回它是否有重复值。

测试样例：
[1,2,3,4,5,5,6],7
返回：true
 */
public class Checker {
    public boolean checkDuplicate(int[] a, int n) {
        // write code here
        Arrays.sort(a);
        for(int i =1;i<a.length;i++){
            if(a[i]==a[i-1])return true;
        }
        return false;


    }
}

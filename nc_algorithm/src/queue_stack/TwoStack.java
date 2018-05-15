package queue_stack;/*
编写一个类,只能用两个栈结构实现队列,支持队列的基本操作(push，pop)。

给定一个操作序列ope及它的长度n，其中元素为正数代表push操作，为0代表pop操作，保证操作序列合法且一定含pop操作，请返回pop的结果序列。

测试样例：
[1,2,3,0,4,0],6
返回：[1,2]
 */
import java.util.*;

public class TwoStack {
    public int[] twoStack(int[] ope, int n) {
        // write code here
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int count = 0;
        for(int i =0;i<n;i++){
            if(ope[i]>0){
                s1.push(ope[i]);
            }
            else{
                count++;
            }
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());

        }
        int[] res = new int[count];
        for(int i =0;i<count;i++){
            res[i]=s2.pop();
        }
        return res;

    }
}
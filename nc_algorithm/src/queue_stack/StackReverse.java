package queue_stack;

import java.util.Stack;

/*
实现一个栈的逆序，但是只能用递归函数和这个栈本身的pop操作来实现，而不能自己申请另外的数据结构。

给定一个整数数组A即为给定的栈，同时给定它的大小n，请返回逆序后的栈。

测试样例：
[4,3,2,1],4
返回：[1,2,3,4]
 */
//用数组实现
//public class StackReverse {
//    public int[] reverseStack(int[] A, int n) {
//        // write code here
//        reverse(A,0,n);
//        return A;
//    }
//    public static void reverse(int[] a,int index,int n){
//        if(index==n-1)return ;
//        int temp = getBottom(a,index,n);
//        index++;
//        reverse(a,index,n);
//        index--;
//        a[index] = temp;
//        return ;
//    }
//    public static int  getBottom(int[] a,int index,int n) {
//        if(index==n-1)return a[n-1];
//        int temp = a[index];
//        index++;
//        int res = StackReverse.getBottom(a,index,n);
//        a[index]=temp;
//        return res;
//    }
//
//}
//用堆栈实现
public class StackReverse {
    Stack<Integer> stack = new Stack<Integer>();
    public int get(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = get(stack);
            stack.push(result);
            return last;
        }
    }
    public void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = get(stack);
        reverse(stack);
        stack.push(i);
    }
    public int[] reverseStack(int[] A, int n) {
        //进栈的顺序一定注意，4321进栈后，4在栈顶，所以应从后向前进栈
        for (int i = n-1; i >=0; i--) {
            stack.push(A[i]);
        }
        reverse(stack);
        int[] res = new int[n];
        for (int i = 0; i<n; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}

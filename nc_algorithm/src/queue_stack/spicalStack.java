package queue_stack;

import java.util.LinkedList;
import java.util.Stack;

/*
定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class spicalStack {
    Stack<Integer> s1 =new Stack<>();
    Stack<Integer> s2 =new Stack<>();
    public void push(int node) {
        s1.push(node);
        if(s2.isEmpty()||s2.peek()>=node){//这里一定注意先判断这个栈是否为空，在去取栈顶的值，不然会有异常发生
            s2.push(node);
        }
        else{
            s2.push(s2.peek());
        }
    }
    public void pop() {
        s1.pop();
        s2.pop();
    }
    public int top() {
        return s1.peek();
    }
    public int min() {
        return s2.peek();
    }
}

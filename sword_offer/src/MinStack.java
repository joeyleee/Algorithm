import java.util.Stack;

/*
定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class MinStack {
    Stack<Integer> s =new Stack<>();
    public void push(int node) {
        if(s.isEmpty()){
            s.push(node);
            s.push(node);
        }
        else{
            int temp=node>s.peek()?s.peek():node;
            s.push(node);
            s.push(temp);
        }
    }

    public void pop() {
        s.pop();
        s.pop();
    }

    public int top() {
        int temp=s.pop();
        int res=s.peek();
        s.push(temp);
        return res;
    }

    public int min() {
        return s.peek();
    }
}

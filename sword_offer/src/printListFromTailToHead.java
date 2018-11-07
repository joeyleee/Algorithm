import java.util.ArrayList;
import java.util.Stack;

/*
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if(listNode==null)return res;
        Stack<Integer> s= new Stack<>();
        ListNode node=listNode;
        while(node!=null){
            s.push(node.val);
            node=node.next;
        }
        while(!s.isEmpty()){
            res.add(s.pop());
        }
        return res;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

package linkedlist;
/*
有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，并且保证这个环形单链表依然有序。

给定链表的信息，及元素的值A及对应的nxt指向的元素编号同时给定val，请构造出这个环形链表，并插入该值。

测试样例：
[1,3,4,5,7],[1,2,3,4,0],2
返回：{1,2,3,4,5,7}
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class InsertValue {
    public static ListNode insert(int[] A, int[] nxt, int val) {
        // write code here
        if(A.length==0)return new ListNode(val);
        ListNode head = new ListNode(A[0]);
        ListNode cur=head;
        for(int i=0;i<nxt.length-1;i++){
            ListNode node = new ListNode(A[nxt[i]]);
            cur.next=node;
            cur=node;
        }
        if(val<head.val){
            ListNode temp = new ListNode(val);
            temp.next=head;
            cur.next=temp;
            return temp;
        }
        ListNode pre = head;
        ListNode next =head.next;
        while(next!=null&&next.val<val){
            pre=next;
            next=next.next;
        }
        ListNode temp = new ListNode(val);
        if(next!=null){
            pre.next=temp;
            temp.next=next;
        }else{
            pre.next=temp;
            temp=head;
        }
        return head;
    }
    public static void main(String args[]){
        int[] s1={1,3,4,5,7};
        int[] s2={1,2,3,4,0};
        ListNode node=InsertValue.insert(s1,s2,2);
        for(int i=0;i<6;i++){
            System.out.println(node.val);
            node=node.next;
        }
    }
}

